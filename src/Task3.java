import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = "TORT";
        /* коммент к занятию 4 (на ютубе)
        c if - ом задачу легче решать
         */
        if (N % 10 == 1 && N != 11) System.out.println(N + " " + s);
        else if (N % 10 == 2 && N != 12) System.out.println(N + " " + s + "A");
        else if (N % 10 == 3 && N != 13) System.out.println(N + " " + s + "A");
        else if (N % 10 == 4 && N != 14) System.out.println(N + " " + s + "A");
        else System.out.println(N + " " + s + "OV");;
    }
}
