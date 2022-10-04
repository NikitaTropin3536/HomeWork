import java.util.Scanner;

public class Task4var2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < N - 1; i++) {
            if (array[i + 1] > array[i]) {
                System.out.print(array[i + 1] + " ");
            }
        }
    }
}

