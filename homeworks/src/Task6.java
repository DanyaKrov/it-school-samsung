import java.util.Scanner;
        import java.lang.String;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n = in.nextFloat();
        float n2 = in.nextFloat();
        if (n < n2 && n2 < 2 - n * n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}