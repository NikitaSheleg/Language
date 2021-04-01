package statements;

import base.Base;
import expressions.Condition;
import expressions.DefineVariable;
import expressions.Expression;
import expressions.Parameter;

import java.util.List;

public class ForStatement extends Statement {
    private DefineVariable parameter;
    private List<Base> statements;
    private Condition condition;
    private Expression expression;

    public ForStatement(DefineVariable parameter, List<Base> statements, Condition condition, Expression expression) {
        this.parameter = parameter;
        this.statements = statements;
        this.condition = condition;
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Base stat : statements) {
            builder.append(stat.toString());
            if (!stat.toString().endsWith("}"))
                builder.append(";");

        }
        return "for(" +
                parameter.toString() + ";" +
                condition.toString() + ";" +
                expression.toString() + "){" +
                builder + "}";
    }
}
