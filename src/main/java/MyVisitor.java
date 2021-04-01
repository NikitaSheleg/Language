import antlr.AntlrTestBaseVisitor;
import antlr.AntlrTestParser;
import base.Base;
import expressions.*;
import expressions.Math;
import expressions.Number;
import statements.*;

import java.util.*;

public class MyVisitor extends AntlrTestBaseVisitor<Base> {

    //TODO bind vars to functions
    private static final TreeMap<String, Map<String, String>> varTable = new TreeMap<>();
    private static final Map<String, String> varsMemory = new HashMap<>();
    private static final Map<String, List<Parameter>> functionParamsMemory = new HashMap<>();
    public static List<String> code = new ArrayList<>();

    @Override
    public Number visitNum(AntlrTestParser.NumContext ctx) {
        if (ctx.NUM() != null)
            return new Number(ctx.NUM().getText());
        else return new Number(ctx.dbl().getText());
    }

    @Override
    public Base visitDbl(AntlrTestParser.DblContext ctx) {

        return new Number(ctx.NUM(0).getText(), ctx.NUM(1).getText());
    }

    @Override
    public Base visitMulDiv(AntlrTestParser.MulDivContext ctx) {

        Math math;
        if (ctx.operation.getType() == AntlrTestParser.MULTIPLICATION) {
            math = new Math(
                    "mult",
                    (Expression) visit(ctx.expression(0)),
                    (Expression) visit(ctx.expression(1)));
        } else {
            math = new Math(
                    "div",
                    (Expression) visit(ctx.expression(0)),
                    (Expression) visit(ctx.expression(1)));
        }
        // code.add(math.toString());
        return math;
    }


    @Override
    public Base visitPlusMinus(AntlrTestParser.PlusMinusContext ctx) {

        Math math;
        if (ctx.operation.getType() == AntlrTestParser.PLUS) {
            math = new Math(
                    "plus",
                    (Expression) visit(ctx.expression(0)),
                    (Expression) visit(ctx.expression(1)));
        } else {
            math = new Math(
                    "minus",
                    (Expression) visit(ctx.expression(0)),
                    (Expression) visit(ctx.expression(1)));
        }
        // code.add(math.toString());
        return math;
    }

    @Override
    public Base visitParens(AntlrTestParser.ParensContext ctx) {
        return new Parens((Expression) visit(ctx.expression()));
    }

    @Override
    public NameAndValue visitId(AntlrTestParser.IdContext ctx) {
        return new NameAndValue(ctx.identifier().NAME().getText(),
                ctx.identifier().NUM().getText()
        );
    }

    @Override
    public Base visitVarEqlsFunc(AntlrTestParser.VarEqlsFuncContext ctx) {
        checkForLegalVar(ctx.NAME().getText());
        return new NameAndValue(ctx.NAME().getText(),
                visit(ctx.function_call()).toString());
    }

    @Override
    public NameAndValue visitIdentifier(AntlrTestParser.IdentifierContext ctx) {

        return new NameAndValue(ctx.NAME().getText(),
                ctx.NUM().getText()
        );
    }

    @Override
    public Base visitDefineVariable(AntlrTestParser.DefineVariableContext ctx) {
        String currentType = ctx.TYPE().getText();
        String name, value = null;
        if (ctx.identifier() != null) {
            name = ctx.identifier().NAME().getText();
            value = ctx.identifier().NUM().getText();
        } else {
            name = ctx.NAME().getText();
        }

        if (ctx.expression() != null &&
                ctx.expression().getChild(0) instanceof AntlrTestParser.DblContext) {
            if (!currentType.equals("Float"))
                try {
                    throw new Exception("illegal var type");
                } catch (Exception e) {
                    e.printStackTrace();
                    MyWalker.setErrors(true);
                }
            value = visit(ctx.expression().getChild(0)).toString();
        } else if (ctx.expression() != null) {
            value = visit(ctx.expression()).toString();
        }


        varsMemory.put(name, currentType);
        DefineVariable defineVariable = new DefineVariable(ctx.TYPE().getText(),
                new NameAndValue(name, value));

        //  code.add(defineVariable.toString());
        if (ctx.expression() != null)
            visit(ctx.expression());
        return defineVariable;


    }

    @Override
    public Condition visitCompare(AntlrTestParser.CompareContext ctx) {
        checkForLegalVar(ctx.expression(0).getChild(0).getText());

        return new Condition(visit(ctx.expression(0)).toString(),
                visit(ctx.expression(1)).toString(),
                ctx.operation.getText());
    }

    @Override
    public Base visitIf_Rule(AntlrTestParser.If_RuleContext ctx) {
        List<Base> statements = new ArrayList<>();
        checkForLegalVar(ctx.expression().getChild(0).getText());
        checkForLegalVar(ctx.expression().getChild(2).getText());

        for (int i = 0; i < ctx.statement().size(); i++) {
            statements.add(visit(ctx.statement(i)));

        }
        if (ctx.else_rule() != null) {

            return new IfStatement(
                    new Condition(ctx.expression().getChild(0).getText(),
                            ctx.expression().getChild(2).getText(),
                            ctx.expression().getChild(1).getText()), statements, visitElse_rule(ctx.else_rule())
            );
        }
        // code.add(ifStatement.toString());
        return new IfStatement(
                new Condition(ctx.expression().getChild(0).getText(),
                        ctx.expression().getChild(2).getText(),
                        ctx.expression().getChild(1).getText()), statements
        );
    }

    @Override
    public ElseStatement visitElse_rule(AntlrTestParser.Else_ruleContext ctx) {
        List<Base> statements = new ArrayList<>();
        for (int i = 0; i < ctx.statement().size(); i++) {
            statements.add(visit(ctx.statement(i)));

        }
        return new ElseStatement(statements);
    }

    @Override
    public Base visitWhile_Rule(AntlrTestParser.While_RuleContext ctx) {
        List<Base> statements = new ArrayList<>();
        checkForLegalVar(ctx.expression().getChild(0).getText());
        checkForLegalVar(ctx.expression().getChild(2).getText());
        for (int i = 0; i < ctx.statement().size(); i++) {
            for (int j = 0; j < ctx.statement(i).statement_rules().size(); j++) {
                statements.add(visitStatement_rules(ctx.statement(i).statement_rules(j)));

            }

        }
        //  code.add(state.toString());
        return new While(
                new Condition(ctx.expression().getChild(0).getText(),
                        ctx.expression().getChild(2).getText(),
                        ctx.expression().getChild(1).getText()), statements

        );
    }


    @Override
    public Base visitCool(AntlrTestParser.CoolContext ctx) {

        Base defaultRespond = null;
        if (ctx.function() != null) {
            for (int i = 0; i < ctx.function().size(); i++) {
                defaultRespond = visit(ctx.function(i));
            }
        }
        if (ctx.mainFunction() != null) {
            defaultRespond = visit(ctx.mainFunction(0));
        }

        return defaultRespond;


    }

    @Override
    public Base visitStatement(AntlrTestParser.StatementContext ctx) {
        Base defaultRespond = null;
        for (int i = 0; i < ctx.statement_rules().size(); i++) {
            defaultRespond = visit(ctx.statement_rules(i));
        }

        return defaultRespond;
    }

    @Override
    public Base visitName(AntlrTestParser.NameContext ctx) {
        checkForLegalVar(ctx.NAME().getText());
        return new Expression(ctx.NAME().getText());
    }

    @Override
    public Base visitUnaryOperator(AntlrTestParser.UnaryOperatorContext ctx) {
        if (!varsMemory.containsKey(ctx.NAME().getText()))
            try {
                throw new Exception("no such variable");
            } catch (Exception e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        return new UnaryOperator(ctx.NAME().getText(),
                ctx.UNARY_OPERATOR().getText(),
                ctx.UNARY_OPERATOR_SIDE().getText());
    }

    @Override
    public MainFunctionNode visitMainFunction(AntlrTestParser.MainFunctionContext ctx) {
        List<Base> statements = new ArrayList<>();

        Map<String, String> funcVars = new HashMap<>();
        varsMemory.clear();
        varTable.put("main", funcVars);

        for (int i = 0; i < ctx.statement().size(); i++) {

            for (int j = 0; j < ctx.statement(i).statement_rules().size(); j++) {
                for (int k = 0; k < ctx.statement(i).statement_rules(j).expression().size() - 1; k++) {

                    statements.add(visit(ctx.statement(i).statement_rules(j).expression(k)));
                }
                varTable.get("main").putAll(varsMemory);
                Base statement = visit(ctx.statement(i).statement_rules(j));
                if (statement != null) {
                    statements.add(statement);
                }
            }
            // statements.add(visit(ctx.statement(i)));
        }

        varsMemory.clear();
        //TODO idk about this


        MainFunctionNode mainFunctionNode = new MainFunctionNode(statements);
        code.add(mainFunctionNode.toString());
        return mainFunctionNode;
    }

    @Override
    public Base visitBreak_Rule(AntlrTestParser.Break_RuleContext ctx) {
        return new BrakeStatement();
    }

    @Override
    public Base visitFunction(AntlrTestParser.FunctionContext ctx) {
        List<Base> statements = new ArrayList<>();
        List<Parameter> parameters = new ArrayList<>();
        varsMemory.clear();
        for (int i = 0; i < ctx.parameter().size(); i++) {
            parameters.add(visitParameter(ctx.parameter(i)));
        }

        functionParamsMemory.put(ctx.NAME().getText(), parameters);

        //TODO idk about this
        Map<String, String> funcVars = new HashMap<>(varsMemory);
        varTable.put(ctx.NAME().getText(), funcVars);
        for (int i = 0; i < ctx.statement().size(); i++) {
            for (int j = 0; j < ctx.statement(i).statement_rules().size(); j++) {
                for (int k = 0; k < ctx.statement(i).statement_rules(j).expression().size() - 1; k++) {
                    statements.add(visit(ctx.statement(i).statement_rules(j).expression(k)));
                }
                varTable.get(ctx.NAME().getText()).putAll(varsMemory);
                Base statement = visit(ctx.statement(i).statement_rules(j));
                if (statement != null) {
                    statements.add(statement);
                }
            }
        }
        varTable.get(ctx.NAME().getText()).putAll(varsMemory);


        statements.add(visit(ctx.return_Rule()));

        Function function = new Function(parameters, ctx.NAME().getText(), ctx.TYPE().getText(), statements);
        code.add(function.toString());
        return function;
    }

    @Override
    public Parameter visitParameter(AntlrTestParser.ParameterContext ctx) {
        if (ctx.TYPE() != null) {
            varsMemory.put(ctx.NAME().getText(), ctx.TYPE().getText());
            return new Parameter(ctx.TYPE().getText(), ctx.NAME().getText());
        } else if (ctx.NAME() != null)
            return new Parameter(ctx.NAME().getText());
        else
            return new Parameter(ctx.NUM().getText());
    }

    @Override
    public Base visitReturn_Rule(AntlrTestParser.Return_RuleContext ctx) {
        if (ctx.expression() != null)
            return new ReturnStatement(visit(ctx.expression()));
        else return new ReturnStatement(visit(ctx.function_call()));
    }

    private void checkForLegalVar(String var) {
        if (!varTable.lastEntry().getValue().containsKey(var)) {
            try {
                throw new Exception("illegal variable used");
            } catch (Exception e) {
                e.printStackTrace();
                MyWalker.setErrors(true);
            }
        }

    }

    @Override
    public FunctionCall visitFunction_call(AntlrTestParser.Function_callContext ctx) {
        if (!functionParamsMemory.containsKey(ctx.NAME().getText())) {
            try {
                throw new Exception("illegal function call");
            } catch (Exception e) {
                e.printStackTrace();
                MyWalker.setErrors(true);
            }
        } else if (functionParamsMemory.get(ctx.NAME().getText()).size() != ctx.parameter().size()) {
            try {
                throw new Exception("illegal number of function parameters");
            } catch (Exception e) {
                e.printStackTrace();
                MyWalker.setErrors(true);
            }
        }
        for (int i = 0; i < ctx.parameter().size(); i++) {
            checkForLegalVar(ctx.parameter(i).getText());
        }

        List<Base> parameters = new ArrayList<>();
        for (int i = 0; i < ctx.parameter().size(); i++) {
            parameters.add(visit(ctx.parameter(i)));
        }
        return new FunctionCall(parameters, ctx.NAME().getText(), "Test");
    }

    @Override
    public Base visitTypeConverter(AntlrTestParser.TypeConverterContext ctx) {
        TypeConvertion typeConvertion;
        if (ctx.NUM() != null)
            typeConvertion = new TypeConvertion(ctx.TYPE().getText(), ctx.NUM().getText());
        else if (ctx.NAME() != null) {
            if (varsMemory.containsKey(ctx.NAME().getText()))
                typeConvertion = new TypeConvertion(ctx.TYPE().getText(), ctx.NAME().getText());
            else throw new ClassCastException("illegal var used");
        } else
            typeConvertion = new TypeConvertion(ctx.TYPE().getText(), visit(ctx.dbl()).toString());


        return typeConvertion;
    }

}
