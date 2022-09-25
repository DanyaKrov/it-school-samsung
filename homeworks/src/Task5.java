import java.util.Scanner;
import java.lang.String;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if ((a / 100 > 0 && a % 5 == 0) && (b / 100 > 0 && b % 5 == 0))
            System.out.println("true");
        else if ((a / 100 > 0 && a % 5 == 0) && (c / 100 > 0 && c % 5 == 0))
            System.out.println("true");
        else if ((c / 100 > 0 && c % 5 == 0) && (b / 100 > 0 && b % 5 == 0))
            System.out.println("true");
        else
            System.out.println("false");
    }
}