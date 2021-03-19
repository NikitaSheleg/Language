import antlr.AntlrTestLexer;
import antlr.AntlrTestParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {


        CharStream inputStream = CharStreams.fromString(
                "main" +
                        "auf" +
                        "{" +
                        "Integer a=3" +
                        "Integer b= 12" +
                        "Integer c = 9" +
                       "if(a<b){" +
                        " right ++ a;" +
                        "left -- b;" +
                        "right ++ b;" +
                        "}" +
                        "}");

//"if(1>2){1-2}else if(1<2){if(1==1){3-2} else{1-3}} else{1-4}"
     /*"Integer a =6;" +
                                "Integer b= 6;" +
                                "if(a>b){7*7;}" +
                                "else if(a==b){4*5;}" +
                                "else{2*2;}"*/

//for(Integer a = 2 a<5 a=8){1-5}
        AntlrTestLexer lexer = new AntlrTestLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AntlrTestParser parser = new AntlrTestParser(tokens);
        ParseTree tree = parser.cool(); // parse
        MyVisitor visitor = new MyVisitor();
        Base result = visitor.visit(tree);
        Converter converter = new Converter();
        converter.toJava(MyVisitor.code, Paths.get("src/main/java/Test.java"));
        System.out.println(result);



    }

    private String executeCommand(String command) {
        StringBuffer output = new StringBuffer();
        Process p;

        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return output.toString();

    }
}


