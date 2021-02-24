import antlr.AntlrTestBaseListener;
import antlr.AntlrTestParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;

public class MyWalker extends AntlrTestBaseListener {
    AntlrTestParser parser;

    public MyWalker(AntlrTestParser parser) {
        this.parser = parser;
    }

    @Override
    public void enterFunction(AntlrTestParser.FunctionContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        String type = "void";
        if (ctx.TYPE() != null) {
            type =ctx.TYPE().getText();
        }
        String args = tokens.getText(ctx.expression());
        System.out.println("\t" + type + " " + ctx.NAME() +"("+ args+")" + ";");

    }
}
