public class Test {
    public static void main(String[] args) {
        Integer a = 3;
        Integer b = 12;
        Integer c = 9;
        while (a < b) {
            --a;
            break;
        }
        if (a < b) {
            a++;
            --b;
            b++;
        }
    }

    Integer func(Integer v) {
        while (1 > 3) {
            2++;
        }
        if (1 > 2) {
            --1;
        }
        return 2;
    }

    Integer fuck(Integer v, Integer f) {
        while (1 > 3) {
            2++;
        }
        if (1 > 2) {
            --1;
        }
        return 2;
    }
}
