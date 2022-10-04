import java.util.Scanner;
import java.lang.String;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[] = new int[n];
        int min = 9999;
        for (int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
        for (int i = 1; i < n; i++){
            if (nums[i] > nums[i - 1]){
                System.out.print(nums[i] + " ");
            }
        }
    }
}