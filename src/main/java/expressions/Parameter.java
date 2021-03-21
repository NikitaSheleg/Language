package expressions;

public class Parameter {
    private String type, name;
    private Number number;

    public Parameter(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Parameter(String name) {
        this.name = name;
    }

    public Parameter(Number number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if (number != null)
            return number.toString();
        else return type + " " + name;
    }
}
