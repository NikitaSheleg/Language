package statements;

import base.Base;
import expressions.Condition;

import java.util.List;

public class IfStatement extends Statement {
    private Condition condition;
    private List<Base> statements;

    public IfStatement(Condition condition, List<Base> statements) {
        this.condition = condition;
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Base stat : statements) {

            builder.append(stat.toString());
            if (!stat.toString().endsWith("}"))
                builder.append(";");

        }
        return "if(" + condition.toString() + ")\n{" + builder + "}";
    }
}
