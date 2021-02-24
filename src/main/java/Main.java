import antlr.AntlrTestLexer;
import antlr.AntlrTestParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) {


        CharStream inputStream = CharStreams.fromString("Integer a=3;" +
                "Integer b= 12;" +
                "while(a<b){a++;}");
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

       /* ParseTreeWalker walker = new ParseTreeWalker();
        MyWalker extractor = new MyWalker(parser);
        walker.walk(extractor, tree);*/
        //System.out.println(tree.toStringTree(parser)); // print tree as text
    }
}
