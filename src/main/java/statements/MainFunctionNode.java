package statements;

import base.Base;
import statements.Function;

import java.util.List;

public class MainFunctionNode extends Function {
    private List<Base> statements;

    public MainFunctionNode(List<Base> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Base stat : statements) {
            builder.append(stat.toString());
            if (!stat.toString().endsWith("}"))
                builder.append(";");

        }
        return
                "public static void main(String[] args)" +
                        "{" +
                        builder +
                        "}";
    }
}
