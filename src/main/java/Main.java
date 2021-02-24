import antlr.AntlrTestBaseListener;
import antlr.AntlrTestLexer;
import antlr.AntlrTestListener;
import antlr.AntlrTestParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) {

        /*AntlrTestLexer lexer = new AntlrTestLexer(CharStreams.fromString("9 + 8+3"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AntlrTestParser parser = new AntlrTestParser(tokens);
        ParseTree tree = parser.expression();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new MyWalker(), tree);*/

        CharStream inputStream = CharStreams.fromString(

                        "Integer a =8;" +
                                "Integer b= 6;" +
                                "if(a>b){7*7;}" +
                                "else if(a<b){4*5;}" +
                                "else{2*2;}" );
//"if(1>2){1-2}else if(1<2){if(1==1){3-2} else{1-3}} else{1-4}"
       /* AntlrTestLexer lexer = new AntlrTestLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        AntlrTestParser parser = new AntlrTestParser(commonTokenStream);
        AntlrTestParser.ExpressionContext expressionContext = parser.expression();
        MyVisitor visitor = new MyVisitor();
        visitor.visit(expressionContext);*/

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
