package expressions;

import expressions.Expression;

public class Math extends Expression {

    private String operation, left, right;

    public Math(String operation, String left, String right) {

        this.operation = operation;
        this.left = left;
        this.right = right;
    }



    @Override
    public String toString() {
        switch (operation) {
            case "plus": {
                return left + "+" + right;
            }
            case "minus": {
                return left + "-" + right;
            }
            case "mult": {
                return left + "*" + right;
            }
            case "div": {
                return left + "/" + right;
            }
        }
       return "nothing";
    }
}
