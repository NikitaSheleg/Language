package expressions;

import expressions.Expression;

public class DefineVariable extends Expression {
    private String type;
    private NameAndValue nameAndValue;

    public DefineVariable(String type, NameAndValue nameAndValue) {
        this.type = type;
        this.nameAndValue=nameAndValue;
    }

    public String getType() {
        return type;
    }

    public NameAndValue getNameAndValue() {
        return nameAndValue;
    }

    @Override
    public String toString() {
        return type + " " +nameAndValue.toString();
    }
}
