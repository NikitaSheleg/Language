import antlr.AntlrTestBaseVisitor;
import antlr.AntlrTestParser;
import base.Base;
import expressions.*;
import expressions.Math;
import expressions.Number;
import statements.*;

import java.util.*;

public class MyVisitor extends AntlrTestBaseVisitor<Base> {


    private static Map<String, String> memory = new HashMap<>();
    private static Map<String, List<Parameter>> functionParamsMemory = new HashMap<>();
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
        if (ctx.operation.getType() == AntlrTestParser.PLUS) {
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
        NameAndValue nameAndValue = new NameAndValue(ctx.identifier().NAME().getText(),
                ctx.identifier().NUM().getText()
        );
        return nameAndValue;
    }

    @Override
    public Base visitVarEqlsFunc(AntlrTestParser.VarEqlsFuncContext ctx) {
        NameAndValue nameAndValue = new NameAndValue(ctx.NAME().getText(),
                visit(ctx.function_call()).toString());
        return nameAndValue;
    }

    @Override
    public NameAndValue visitIdentifier(AntlrTestParser.IdentifierContext ctx) {

        NameAndValue nameAndValue = new NameAndValue(ctx.NAME().getText(),
                ctx.NUM().getText()
        );
        return nameAndValue;
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


        memory.put(name, currentType);
        DefineVariable defineVariable = new DefineVariable(ctx.TYPE().getText(),
                new NameAndValue(name, value));

        //  code.add(defineVariable.toString());
        if (ctx.expression() != null)
            visit(ctx.expression());
        return defineVariable;


    }

    @Override
    public Condition visitCompare(AntlrTestParser.CompareContext ctx) {
        return new Condition(visit(ctx.expression(0)).toString(),
                visit(ctx.expression(1)).toString(),
                ctx.operation.getText());
    }

    @Override
    public Base visitIf_Rule(AntlrTestParser.If_RuleContext ctx) {
        List<Base> statements = new ArrayList<>();
        for (int i = 0; i < ctx.statement().size(); i++) {
            statements.add(visit(ctx.statement(i)));

        }
        IfStatement ifStatement = new IfStatement(
                new Condition(ctx.expression(0).getChild(0).getText(),
                        ctx.expression(0).getChild(2).getText(),
                        ctx.expression(0).getChild(1).getText()), statements
        );
        // code.add(ifStatement.toString());
        return ifStatement;
    }

    @Override
    public Base visitWhile_Rule(AntlrTestParser.While_RuleContext ctx) {
        List<Base> statements = new ArrayList<>();
        for (int i = 0; i < ctx.statement().size(); i++) {
            statements.add(visit(ctx.statement(i)));

        }
        While state = new While(
                new Condition(ctx.expression().getChild(0).getText(),
                        ctx.expression().getChild(2).getText(),
                        ctx.expression().getChild(1).getText()), statements

        );
        //  code.add(state.toString());
        return state;
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

        return new Expression(ctx.NAME().getText());
    }

    @Override
    public Base visitUnaryOperator(AntlrTestParser.UnaryOperatorContext ctx) {
        if (!memory.containsKey(ctx.NAME().getText()))
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
        for (int i = 0; i < ctx.statement().size(); i++) {

            for (int j = 0; j < ctx.statement(i).statement_rules().size(); j++) {
                for (int k = 0; k < ctx.statement(i).statement_rules(j).expression().size() - 1; k++) {
                    statements.add(visit(ctx.statement(i).statement_rules(j).expression(k)));
                }
                statements.add(visit(ctx.statement(i).statement_rules(j)));
            }
            // statements.add(visit(ctx.statement(i)));
        }


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
        for (int i = 0; i < ctx.statement().size(); i++) {
            for (int j = 0; j < ctx.statement(i).statement_rules().size(); j++) {
                for (int k = 0; k < ctx.statement(i).statement_rules(j).expression().size() - 1; k++) {
                    statements.add(visit(ctx.statement(i).statement_rules(j).expression(k)));
                }
                statements.add(visit(ctx.statement(i).statement_rules(j)));
            }
        }
        for (int i = 0; i < ctx.parameter().size(); i++) {
            parameters.add(visitParameter(ctx.parameter(i)));
        }
        if (ctx.return_Rule().expression() != null)
            for (int i = 0; i < ctx.return_Rule().expression().getChild(0).getChildCount(); i++) {
                if (ctx.return_Rule().expression().getChild(0).getChild(i).getText().equals(".") &&
                        !ctx.TYPE().getText().equals("Float")) {
                    try {
                        throw new Exception("illegal return type");
                    } catch (Exception e) {
                        e.printStackTrace();
                        MyWalker.setErrors(true);
                    }
                }
            }
        statements.add(visit(ctx.return_Rule()));
        functionParamsMemory.put(ctx.NAME().getText(), parameters);
        Function function = new Function(parameters, ctx.NAME().getText(), ctx.TYPE().getText(), statements);
        code.add(function.toString());
        return function;
    }

    @Override
    public Parameter visitParameter(AntlrTestParser.ParameterContext ctx) {
        if (ctx.TYPE() != null)
            return new Parameter(ctx.TYPE().getText(), ctx.NAME().getText());
        else if (ctx.NAME() != null)
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

    @Override
    public Base visitFunction_call(AntlrTestParser.Function_callContext ctx) {
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

        List<Base> parameters = new ArrayList<>();
        for (int i = 0; i < ctx.parameter().size(); i++) {
            parameters.add(visit(ctx.parameter(i)));
        }
        return new FunctionCall(parameters, ctx.NAME().getText(), "Test");
    }


}
