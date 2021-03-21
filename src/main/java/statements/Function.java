package statements;

import base.Base;
import expressions.Parameter;

public class Function extends Base {
    private Parameter parameter;
    private String name, type;

    public Function() {
    }

    public Function(Parameter parameter, String name, String type) {
        this.parameter = parameter;
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return type +
                " " +
                name + " ( " +
                parameter.toString() +
                ")" +
                "{";
    }
}
