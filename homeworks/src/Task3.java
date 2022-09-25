import java.util.Scanner;
import java.lang.String;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String min = Integer.toString((n % 3600) / 60);
        if (min.length() == 1){
            min = "0" + min;
        }
        String sec = Integer.toString(n % 60);
        if (sec.length() == 1){
            sec = "0" + sec;
        }
        System.out.println(n / 3600 + ":" + min + ":" + sec);
    }
}