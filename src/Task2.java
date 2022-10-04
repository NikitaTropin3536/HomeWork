import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int n1 = Math.abs(n);
        int n2 = 0;
        while (n1 > 0) {
            // находим остаток - последнюю цифру числа
            int digit = n1 % 10;
            // делим нацело - удаляем последнюю цифру числа
            n1 = n1 / 10;
            /* увеличиваем разрядность второго числа
            это операция должна повторяться x раз (x - количество разрядов в первом числе)
             */
            n2 = n2 * 10;
            /* добавляем очередную цифру
            последняя цифра первого чила - первая цифра нового числа и т. д.
             */
            n2 = n2 + digit;
        }
        System.out.println( n < 0 ? -n2 : n2);
    }
}