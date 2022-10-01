import java.util.Scanner;
import java.lang.String;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min = 10;
        while(n > 0){
            if (min > n % 10 && (n % 10) != 0){
                min = n % 10;
            }
            n /= 10;
        }
        System.out.println(min);
    }
}