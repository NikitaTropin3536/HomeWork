import java.util.Scanner;

public class Task1var1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next(), a = sc.next();
        sc.close();
        System.out.println(n.replace(a, ""));
    }
}