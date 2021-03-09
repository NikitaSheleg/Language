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
    private final List<Statement> statements;
    private Path myPath;

    public While(Condition condition, List<Statement> statements, Path myPath) {
        this.condition = condition;
        this.myPath=myPath;
        this.statements = statements;
    }

    @Override
    void toJava() {


        if (Files.exists(myPath)) {

            System.out.println("File already exists");
        } else {

            try {
                Files.createFile(myPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        List<String> lines = new ArrayList<>();
        lines.add("class Test {");
        lines.add("public static void main(String []args){");
        lines.add("while(" + condition.toString() + ")");
        lines.add("{");
        for (Statement statement : statements) {
            lines.add(statement.toString());
        }

        try {
            Files.write(myPath, lines, StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
