import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int f1 = 1;
        if (N == 1 || N == 2) {
            System.out.println(f1);
        } else {
            int f2 = 1;
            int fn = 0;
            for (int i = 2; i < N; i++) {
                fn = f1 + f2;
                f1 = f2; // меняем первое слагаемое
                f2 = fn; // меняем второе слагаемое
            }
            System.out.println(fn);
        }
    }
}
