package expressions;

public class Condition extends Expression {

    private final String operator;

    public Condition(String left, String right, String operator) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }



    @Override
    public String toString() {
        return left + operator + right;
    }
}
