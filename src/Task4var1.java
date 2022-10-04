import java.util.Scanner;

public class Task4var1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt(); // первый элемент массива
        int i = 0;
        int previous = a; //в 1 случае previous - число, идущее перед 2 - м элементом массива
        while (i < N - 1) {
            a = sc.nextInt();
            i++;
            if (a > previous) {
                System.out.print(a + " ");;
            }
            previous = a;
        }
    }
}
