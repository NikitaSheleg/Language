class Test {
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
}
