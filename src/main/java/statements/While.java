package statements;

import base.Base;
import expressions.Condition;
import statements.Statement;

import java.util.List;

public class While extends Statement {
    private final Condition condition;
    private final List<Base> statements;

    public While(Condition condition, List<Base> statements) {
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

        return "while(" +
                condition.toString() + ")"
                + "{" +
                builder +
                '}';
    }
}
