import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = 9;
        int m;
        while (N != 0) {
            m = N % 10;
            if (m < min && m != 0){
                min = m;
            }
            N /= 10;
        }
        System.out.println(min);
    }
}
