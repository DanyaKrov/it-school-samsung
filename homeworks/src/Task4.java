import java.util.Scanner;
import java.lang.String;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        float float_number = Float.parseFloat(n);
        if (float_number < -2 || (float_number > 3 && float_number < 6) || float_number > 9)
            System.out.println("true");
        else
            System.out.println("false");
    }
}