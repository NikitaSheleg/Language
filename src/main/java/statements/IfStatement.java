package statements;

import base.Base;
import expressions.Condition;

import java.util.List;

public class IfStatement extends Statement {
    private Condition condition;
    private List<Base> statements;
    private List<ElseStatement> elseStatements;

    public IfStatement(Condition condition, List<Base> statements) {
        this.condition = condition;
        this.statements = statements;
    }

    public IfStatement(Condition condition, List<Base> statements, List<ElseStatement> elseStatements) {
        this.condition = condition;
        this.statements = statements;
        this.elseStatements = elseStatements;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Base stat : statements) {

            builder.append(stat.toString());
            if (!stat.toString().endsWith("}"))
                builder.append(";");

        }
        if (elseStatements != null) {
            StringBuilder elseBuilder = new StringBuilder();
            for (ElseStatement elseStatement : elseStatements) {
                elseBuilder.append(elseStatement.toString()).append(" ");
            }
            return "if(" + condition.toString() + ")\n{" + builder + "}" + elseBuilder;

        }
        return "if(" + condition.toString() + ")\n{" + builder + "}";
    }
}
