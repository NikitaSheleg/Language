import antlr.AntlrTestParser;

import java.util.Objects;

public class Condition extends Expression {

    private final String operator;

    public Condition(String left, String right, String operator) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    public boolean compareInt() {
        return operator.equals(">") && Integer.parseInt(left) > Integer.parseInt(right) ||
                operator.equals("<") && Integer.parseInt(left) < Integer.parseInt(right) ||
                operator.equals("==") && Objects.equals(left, right);

    }

    public boolean compareDouble(AntlrTestParser.CompareContext ctx) {
        return ctx.operation.getText().equals(">") && Integer.parseInt(left) > Integer.parseInt(right) ||
                ctx.operation.getText().equals("<") && Integer.parseInt(left) < Integer.parseInt(right) ||
                ctx.operation.getText().equals("==") && Objects.equals(left, right);

    }

    @Override
    public String toString() {
        return left + operator + right;
    }
}
