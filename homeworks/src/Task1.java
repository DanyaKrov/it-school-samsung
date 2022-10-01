import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 1;
        int x = 0;
        int num_last = 0;
        while(n > 1){
            x = num;
            num += num_last;
            num_last = x;
            n--;
        }
        System.out.println(num);
    }
}