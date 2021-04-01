public class Test {
    private static Test test = new Test();

    Integer func(Integer v) {
        Integer d = (2 + 4);
        while (d < v) {
            --d;
        }
        return (1 + 2);
    }

    Integer fuck(Integer v, Integer f) {
        return test.func(v);
    }

    public static void main(String[] args) {
        Integer a = 3;
        Integer b = 12;
        Float c = 9.23f;
        Math.round(b);
        Float.valueOf(4);
        while (a < b) {
            --a;
            if (a < b) {
                while (a > b) {
                    a = test.func(b);
                }
            } else {
                b++;
            }
            ;
            break;
        }
        b = test.func(a);
    }
}
