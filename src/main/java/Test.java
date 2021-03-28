public class Test {
    private static Test test = new Test();

    public static void main(String[] args) {
        Integer a = 3;
        Integer b = 12;
        Float c = 9.23f;
        while (a < c) {
            a++;
        }
        if (a < b) {
            a++;
            --b;
            b++;
        }
        test.func(a);
    }

    Integer func(Integer v) {
        return 2;
    }

    Integer fuck(Integer v, Integer f) {
        return 2;
    }
}
