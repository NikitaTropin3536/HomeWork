
import java.util.Locale;
import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.format(Locale.US,"%.2f", avgOf4Digit(array));
        /* для вывода числа
        с двумя знаками после запятой (задача2) */
        // avgOf4Digit
        for (int i : minToBegin(array)) // minToBegin
            System.out.print(i + " ");
    }

    public static double avgOf4Digit(int[] array) {
        double sum = 0;
        double count = 0;
        for (int number: array) {
            if (Integer.toString(number).length() == 4) {
                sum += number;
                count += 1;
            }
        }
        if (count == 0) {
            return -1;
        }
        return sum / count;
    }
    public static int[] minToBegin(int[] array) {
        int min = array[0];
        int ind = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < min) {
                min = array[i];
                ind = i;
            }
        }
        int[] res = new int [array.length];
        res[0] = array[ind];
        for (int i = 1; i < array.length; i++) {
            if (i <= ind)
                res[i] = array[i - 1];
            else
                res[i] = array[i];
        }
        return res;
    }
}