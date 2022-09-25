import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a % 10 + a / 100 + (a % 100) / 10 + " " + (a + 2 - a % 2));
    }
}