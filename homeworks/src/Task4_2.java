import java.util.Scanner;
import java.lang.String;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 0;
        int prev = 0;
        int min = 9999;
        for (int i = 0; i < n; i++){
            num = in.nextInt();
            if (i != 0 && num > prev){
                System.out.print(num + " ");
            }
            prev = num;

        }
    }
}