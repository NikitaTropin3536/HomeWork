import java.util.Scanner;

public class Task1var2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next(), a = sc.next();
        sc.close();
        String[] array = n.split("");
        for(String number: array) {
            if (number.equals(a)) {
                continue;
            }
            System.out.print(number);
        }
    }
}