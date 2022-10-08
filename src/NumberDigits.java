import java.util.Scanner;

public class NumberDigits {
    public static int sumOfSeven(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i >= 10 && i <= 99 && i % 7 == 0) {
                sum += i / 10;
                sum += i % 10;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(sumOfSeven(a, b)); // umOfSeven
    }
}