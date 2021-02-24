import antlr.AntlrTestBaseVisitor;
import antlr.AntlrTestParser;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MyVisitor extends AntlrTestBaseVisitor<Double> {


    private Map<Map<String, String>, Object> memory = new HashMap<>();
    private Map<String, String> currentVariable;

    @Override
    public Double visitNum(AntlrTestParser.NumContext ctx) {
        return Double.parseDouble(ctx.getText());
    }

    @Override
    public Double visitMulDiv(AntlrTestParser.MulDivContext ctx) {
        Double left = visit(ctx.expression(0));
        Double right = visit(ctx.expression(1));

        if (ctx.operation.getType() == AntlrTestParser.MULTIPLICATION)
            return left * right;
        else
            return left / right;

    }


    @Override
    public Double visitPlusMinus(AntlrTestParser.PlusMinusContext ctx) {
        Double left = visit(ctx.expression(0));
        Double right = visit(ctx.expression(1));
        if (ctx.operation.getType() == AntlrTestParser.PLUS)
            return left + right;

        else {
            System.out.println(left - right);
            return left - right;
        }
    }

    @Override
    public Double visitParens(AntlrTestParser.ParensContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Double visitId(AntlrTestParser.IdContext ctx) {
        if (memory.containsKey(currentVariable)) {
            memory.replace(currentVariable, Double.parseDouble(ctx.NUM().getText()));
        } else
            try {
                throw new Exception("we have some problems");
            } catch (Exception e) {
                e.printStackTrace();
            }
        return 0.0;
    }

    @Override
    public Double visitType(AntlrTestParser.TypeContext ctx) {

        String currentType = ctx.TYPE().getText();
        String name = String.valueOf(ctx.expression().getChild(0));
        currentVariable = new HashMap<>();
        currentVariable.put(currentType, name);
        memory.put(currentVariable, null);
        visit(ctx.expression());
        return 0.0;


    }

    @Override
    public Double visitCompare(AntlrTestParser.CompareContext ctx) {
        if (ctx.operation.getText().equals(">") && visit(ctx.expression(0)) > visit(ctx.expression(1)) ||
                ctx.operation.getText().equals("<") && visit(ctx.expression(0)) < visit(ctx.expression(1)) ||
                ctx.operation.getText().equals("==") && Objects.equals(visit(ctx.expression(0)), visit(ctx.expression(1)))) {
            return 0.0;
        } else if (visit(ctx.expression(0)) > visit(ctx.expression(1)))
            return 1.0;
        else if (visit(ctx.expression(0)) < visit(ctx.expression(1)))
            return -1.0;
        else
            return 2.0;
    }


    @Override
    public Double visitStatement(AntlrTestParser.StatementContext ctx) {
        switch (ctx.getChild(0).getText()) {
            case "if": {
                if (visit(ctx.expression(0)) == 0) {
                    return visit(ctx.statement(0));
                } else if (ctx.statement(1) != null && visit(ctx.expression(1)) == 0) {
                    return visit(ctx.statement(1));
                } else {
                    break;
                }

            }
            case "while": {
                if (visit(ctx.expression(0)) == 0) {
                    double result = 0.0;
                    while (visit(ctx.expression(0)) == 0) {
                        result = visit(ctx.statement(0));
                    }
                    return result;
                }
                break;
            }
            case "for": {
                if (visit(ctx.expression(0)) == -1) {
                    for (double i = visit(ctx.parameter()); i < visit(ctx.getChild(7)); visit(ctx.expression(1))) {
                        visit(ctx.statement(0));
                    }
                }
            }
            case "do": {
                visit(ctx.statement(0));
            }
            case "return": {
                if (visit(ctx.expression(0)) == null) {
                    break;
                }

            }
            case "switch": {

            }
        }
        double res = 0;
        for (int j = 0; j < ctx.expression().size(); j++) {
            res = visit(ctx.expression(j));
        }
        for (int j = 0; j < ctx.statement().size(); j++) {
            res = visit(ctx.statement(j));
        }


        return res;
      /*  System.out.println(ctx.getChild(0).getText());
        System.out.println(ctx.expression(0).getText());
*/
    }

    @Override
    public Double visitUnaryRight(AntlrTestParser.UnaryRightContext ctx) {
        double res = visit(ctx.expression());
        switch (ctx.UNARY_OPERATOR().getText()) {
            case "++": {
                res++;

                break;
            }
            case "--": {
                res--;
                break;
            }
        }
        for (Map<String, String> map : memory.keySet()) {
            if (map.containsValue(ctx.expression().getText())) {
                memory.replace(map, res);
            }

        }
        return res;
    }

    @Override
    public Double visitUnaryLeft(AntlrTestParser.UnaryLeftContext ctx) {
        double res = visit(ctx.expression());
        switch (ctx.UNARY_OPERATOR().getText()) {
            case "++": {
                ++res;
                break;
            }
            case "--": {
                --res;
                break;
            }
        }
        return res;
    }

    @Override
    public Double visitName(AntlrTestParser.NameContext ctx) {
        for (Map<String, String> map : memory.keySet()) {
            if (map.containsValue(ctx.NAME().getText())) {
                return (Double) memory.get(map);
            }

        }
        try {
            throw new Exception("no such variable");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
