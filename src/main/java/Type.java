import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Type extends Expression {
    private Path myPath;
    private String type, nameAndValue;

    public Type(Path myPath, String type, String nameAndValue) {
        this.myPath = myPath;
        this.type = type;
        this.nameAndValue=nameAndValue;
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
        lines.add(this.toString());
        try {
            Files.write(myPath, lines, StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return type + " " +nameAndValue+ ";";
    }
}
