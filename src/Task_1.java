import java.util.Scanner;

public class Task_1 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in );
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int i;
        int j = 0;
        for (i = 0; i < n;) {
            a[i][j] = i * j;
            j++; // увеличение индекса элемента строчки
            if (j > m - 1) { // если мы дошли до конца строчки
                i++; // переход на новую строчку
                j = 0; // обнуляем элемент и начинаем работать с новой строчкой
            }
        }
        for (i = 0; i < n;) {
            System.out.print(a[i][j] + "\t"); // элементы строчки выводятся через 4 пробела
            j++;
            if (j > m - 1) {
                i++;
                j = 0;
                System.out.println();
            }
        }
    }
}
