import java.util.Scanner;

public class Task3var2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        int min = array[0];
        for (int i = 0; i < N; i++) {
            if (array[i] > 0 && array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}