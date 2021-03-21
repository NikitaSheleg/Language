import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Converter {
    private List<String> code = new ArrayList<>();

    public void toJava(List<String> code, Path path) {
        this.code.add("public class Test{");
        this.code.add("private static Test test = new Test();");
        this.code.addAll(code);
        this.code.add("}");

        if (Files.exists(path)) {

            System.out.println("File already exists");
        } else {

            try {
                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            Files.write(path, this.code, StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
