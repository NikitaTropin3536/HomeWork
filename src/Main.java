import java.util.Scanner;

public class Main {

    // n
    // n bool -> byte[] 00000000
    //boolean = 1 or 0 (true or false)
    //byte = boolean[8]
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = 0;

        int newLength = n / 8 + 1;

        byte[] b = new byte[newLength];

        extern:
        for (int i = 0; i < newLength; i++) {
            for (int j = 7; j >= 0; j--) {
                boolean input = sc.nextBoolean();
                m++;
                if (input) {
                    int mask = 1 << j;
                    b[i] |= mask;
                }
                if (m == n) break extern;
            }
        }

        m = 0;

        extern:
        for (int i = 0; i < newLength; i++) {
            for (int j = 7; j >= 0; j--) {
                int mask = 1 << j;
                int result = (b[i] & mask);
                System.out.print((result != 0) + " ");
                m++;
                if (m == n) break extern;
            }
        }
    }
}