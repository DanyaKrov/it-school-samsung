import java.util.Scanner;
import java.lang.String;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 10 || n >= 20){
            switch (n % 10){
                case (1):
                    System.out.println(n + " TORT");
                    break;
                case (2):
                    System.out.println(n + " TORTA");
                    break;
                case (3):
                    System.out.println(n + " TORTA");
                    break;
                case (4):
                    System.out.println(n + " TORTA");
                    break;
                default:
                    System.out.println(n + " TORTOV");
                    break;
            }
        }
        else{
            System.out.println(n + " TORTOV");
        }
    }
}