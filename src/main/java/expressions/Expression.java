package expressions;

import base.Base;

public class Expression extends Base {
    private String expr;


    public Expression() {
    }

    public Expression(String expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return expr;
    }
}
