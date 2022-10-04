import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = 0;
        int kol = Integer.toString(num).length() - 1;
        while(num > 0){
            ans += (num % 10) * Math.pow(10, kol);
            kol--;
            num /= 10;
        }
        System.out.println(ans);
    }
}