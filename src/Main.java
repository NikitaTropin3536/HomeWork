public class Main {
    public static void main(String[] args) {
        // тестим Integer
        Trinity<Integer> trinity = new Trinity<>(1,2,3);
        System.out.println(trinity);
        System.out.println();

        // тестим String
        Trinity<String> trinity2 = new Trinity<>("a","b","c");
        System.out.println(trinity2);
        System.out.println();

        // тестим Double
        Trinity<Double> trinity3 = new Trinity<>(1.0,2.34,3.94949);
        System.out.println(trinity3);
        System.out.println();
    }
}
