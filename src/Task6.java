import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), s1 = sc.next();
        float x = Float.parseFloat(s);
        float y = Float.parseFloat(s1);
        if (y >= x) {
            if (-2 <= x && x <= Math.sqrt(2) &&
                    -2 <= y && y <= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
