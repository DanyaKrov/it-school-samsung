import java.util.Scanner;
import java.lang.String;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int total_cost = (a * 100 + b) * n;
        System.out.println(total_cost / 100 + " " + total_cost % 100);
    }
}