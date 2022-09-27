import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),
            b = sc.nextInt(),
            n = sc.nextInt();
        System.out.println((a * 100 + b) * n / 100 + " " +
                ((a * 100 + b) * n % 100));
    }
}