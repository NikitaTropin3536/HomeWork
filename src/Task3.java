import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n % 86400 / 3600;
        int b = n % 86400 % 3600 / 60;
        int c = n % 60;
        System.out.format(a + ":" + "%02d" + ":" + "%02d", b, c);
    }
}

