import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),
                b = sc.nextInt(),
                c = sc.nextInt();
        if (a / 100 >= 1 && b / 100 >= 1 && a % 5 == 0 && b % 5 == 0) {
            System.out.println("true");
        } else if (a / 100 >= 1 && c / 100 >= 1 && a % 5 == 0 && c % 5 == 0) {
            System.out.println("true");
        } else if (b / 100 >= 1 && c / 100 >= 1 && b % 5 == 0 && c % 5 == 0) {
            System.out.println("true");
        } else System.out.println("false");
    }
}
