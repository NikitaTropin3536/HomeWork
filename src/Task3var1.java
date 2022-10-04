import java.util.Scanner;

public class Task3var1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt(); // первый элемент массива
        int i = 0;
        int min = a;
        while (i < N - 1) {
            a = sc.nextInt();
            i++;
            if (a > 0 && a < min) {
                min = a;
            }
        }
        sc.close();
        System.out.println(min);
    }
}