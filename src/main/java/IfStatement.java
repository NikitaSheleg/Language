import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
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
            builder.append(stat.toString()).append(" ");
        }
        return "if(" + condition.toString() + ")\n{" + builder + "}";
    }
}
