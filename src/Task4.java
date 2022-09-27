import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        float x = Float.parseFloat(s);
        System.out.println(x < -2 || 3 < x && x < 6 || x > 9 ? "true" : "false");
    }
}