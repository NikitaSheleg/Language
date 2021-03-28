package statements;

import base.Base;

public class ReturnStatement extends Statement {
    private Base statement;

    public ReturnStatement(Base statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "return " + this.statement.toString() ;
    }
}
