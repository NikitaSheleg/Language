package expressions;

import expressions.Expression;

public class NameAndValue extends Expression {
    private String name, value;

    public NameAndValue(String name, String value) {
        this.name = name;
        this.value = value;

    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + " = " + value ;
    }
}
