package statements;

import base.Base;

public abstract class Statement extends Base {
    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }
}
