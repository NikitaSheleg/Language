package expressions;

import expressions.Expression;

public class Number extends Expression {
    private String number;

    public Number(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number;
    }
}
