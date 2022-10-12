import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rabbits = 11;
        int wolves = 2;
        int eaten_rabbits = 0;
        int N = sc.nextInt();
        for (int month = 1; month < N; month++) {
            if (month % 2 != 0) {
                rabbits *= 3;
                if (rabbits > 19000000) rabbits = 19000000;
            } else {
                if (rabbits / 10 < wolves) wolves -= (wolves - rabbits / 10);
                eaten_rabbits += wolves * 10;
                rabbits -= eaten_rabbits;
            }
            wolves += eaten_rabbits / 70;
            eaten_rabbits %= 70;
        }
        System.out.println("rabbits" + rabbits);
        System.out.println("wolves" + wolves);
    }
}
