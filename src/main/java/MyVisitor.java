import antlr.AntlrTestBaseVisitor;
import antlr.AntlrTestParser;
import base.Base;
import expressions.*;
import expressions.Math;
import expressions.Number;
import statements.BrakeStatement;
import statements.IfStatement;
import statements.MainFunctionNode;
import statements.While;

import java.util.*;

public class MyVisitor extends AntlrTestBaseVisitor<Base> {


    private Map<Map<String, String>, Object> memory = new HashMap<>();
    private Map<String, String> currentVariable;

    public static List<String> code = new ArrayList<>();

    @Override
    public Number visitNum(AntlrTestParser.NumContext ctx) {
        return new Number(ctx.NUM().getText());
    }

    @Override
    public Base visitMulDiv(AntlrTestParser.MulDivContext ctx) {
        Base left = visit(ctx.expression(0));
        Base right = visit(ctx.expression(1));
        Math math;
        if (ctx.operation.getType() == AntlrTestParser.PLUS) {
            math = new Math(
                    "mult",
                    left.toString(),
                    right.toString());
        } else {
            math = new Math(
                    "div",
                    left.toString(),
                    right.toString());
        }
        // code.add(math.toString());
        return math;
    }


    @Override
    public Base visitPlusMinus(AntlrTestParser.PlusMinusContext ctx) {
        Base left = visit(ctx.expression(0));
        Base right = visit(ctx.expression(1));
        Math math;
        if (ctx.operation.getType() == AntlrTestParser.PLUS) {
            math = new Math(
                    "plus",
                    left.toString(),
                    right.toString());
        } else {
            math = new Math(
                    "minus",
                    left.toString(),
                    right.toString());
        }
        // code.add(math.toString());
        return math;
    }

    @Override
    public Base visitParens(AntlrTestParser.ParensContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public NameAndValue visitId(AntlrTestParser.IdContext ctx) {
        NameAndValue nameAndValue = new NameAndValue(ctx.identifier().NAME().getText(),
                ctx.identifier().NUM().getText()
        );
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
        String name;
        if (ctx.expression() != null)
            name = String.valueOf(ctx.expression().getChild(0));
        else name = ctx.identifier().NAME().getText();
        currentVariable = new HashMap<>();
        currentVariable.put(currentType, name);
        memory.put(currentVariable, null);
        DefineVariable defineVariable = new DefineVariable(ctx.TYPE().getText(),
                visitIdentifier((AntlrTestParser.IdentifierContext) ctx.getChild(1))
        );
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
        if (ctx.mainFunction() != null) {
            defaultRespond = visit(ctx.mainFunction());
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
        return new UnaryOperator(ctx.expression().getText(),
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
}
