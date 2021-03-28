import antlr.AntlrTestLexer;
import antlr.AntlrTestParser;
import base.Base;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        Main obj = new Main();
        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromString(obj.readFileAsString("src/CodeSample.auf"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        AntlrTestLexer lexer = new AntlrTestLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AntlrTestParser parser = new AntlrTestParser(tokens);
        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(new MyWalker()); // add ours

        ParseTree tree = parser.cool(); // parse
        MyVisitor visitor = new MyVisitor();


        Base result = visitor.visit(tree);
        if (MyWalker.isErrors())
            return;
        Converter converter = new Converter();
        converter.toJava(MyVisitor.code, Paths.get("src/main/java/Test.java"));
        // System.out.println(result);


        String className = "src/main/java/Test.java";
        String command = "javac " + className;
        String output = obj.executeCommand(command);

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
                output.append(line).append("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return output.toString();

    }


    private String readFileAsString(String filePath) throws IOException {
        StringBuffer fileData = new StringBuffer();
        BufferedReader reader = new BufferedReader(
                new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead = 0;
        while ((numRead = reader.read(buf)) != -1) {
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
        }
        reader.close();
        return fileData.toString();
    }
}


