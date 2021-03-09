import antlr.AntlrTestLexer;
import antlr.AntlrTestParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        CharStream inputStream = CharStreams.fromString(
                "Integer a=3;" +
                        "Integer b= 12;" +
                        "Integer c = 9;" +
                        "while(a<b){" +
                        "if(a<b){a++;}" +
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
        Double result = visitor.visit(tree);
        System.out.println(result);


        Path myPath = Paths.get("src/main/java/Test.java");
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
        lines.add("System.out.println(a);");
        lines.add("}}");
        try {
            Files.write(myPath, lines, StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Main obj = new Main();
        String className = "Test.java";
        String command = "javac " + className;
        String output = obj.executeCommand(command);
        try {
            Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Compiler.command(command);
        System.out.println(output);
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


