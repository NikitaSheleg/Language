package statements;

import base.Base;
import expressions.Parameter;

import java.util.List;

public class Function extends Base {
    private Parameter parameter;
    private String name, type;
    private List<Statement> statements;

    public Function() {
    }

    public Function(Parameter parameter, String name, String type, List<Statement> statements) {
        this.parameter = parameter;
        this.statements = statements;
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Base stat : statements) {
            builder.append(stat.toString()).append(" ");
        }
        return type +
                " " +
                name + " ( " +
                parameter.toString() +
                ")" +
                "{" + builder + "}"
                ;
    }
}
