import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N / 100 + N / 10 % 10 + N % 10 + " " + (N / 2 * 2 + 2));
    }
}
