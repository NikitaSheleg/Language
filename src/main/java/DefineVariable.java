import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class DefineVariable extends Expression {
    private String type;
    private NameAndValue nameAndValue;

    public DefineVariable(String type, NameAndValue nameAndValue) {
        this.type = type;
        this.nameAndValue=nameAndValue;
    }





    @Override
    public String toString() {
        return type + " " +nameAndValue.toString();
    }
}
