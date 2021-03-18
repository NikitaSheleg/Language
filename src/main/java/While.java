import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
            builder.append(stat.toString()).append(" ");
        }

        return "While(" +
                condition.toString() + ")"
                + "{" +
                builder +
                '}';
    }
}
