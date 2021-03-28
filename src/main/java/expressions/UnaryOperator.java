package expressions;

import expressions.Expression;

public class UnaryOperator extends Expression {
    private String var, operator, side;


    public UnaryOperator(String var, String operator, String side) {
        this.var = var;
        this.operator = operator;
        this.side = side;
    }

    @Override
    public String toString() {
        if (side.equals("right"))
            return var + operator ;
        else if (side.equals("left"))
            return operator + var ;
        else return "wrong side";
    }
}
