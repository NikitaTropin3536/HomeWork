import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[2 * n + 1][2 * n + 1];
        int x = 0;
        int y = 2 * n;
        int number = (2 * n + 1) * (2 * n + 1) - 1;
        a[n][n] = 0;
        while (number >= 1) {
            for (int i = 0; i < a.length; i++) {
                if (a[i][y] == 0) a[i][y] = number--;
            }
            for (int i = a.length - 1; i >= 0; i--) {
                if (a[y][i] == 0) a[y][i] = number--;
            }
            for (int i = a.length - 1; i >= 0; i--) {
                if (a[i][x] == 0) a[i][x] = number--;
            }
            for (int i = 0; i < a.length; i++) {
                if (a[x][i] == 0) a[x][i] = number--;
            }
            x++;
            y--;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
