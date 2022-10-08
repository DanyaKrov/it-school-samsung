import java.util.Scanner;

class NumberDigits{
    public static int sumOfSeven(int n1, int n2){
        int sum = 0;
        int num_7 = 0;
        for (int i = n1; i <= n2; i++){
            if (i % 7 == 0){
                num_7 = i;
                while (num_7 > 0){
                    sum += num_7 % 10;
                    num_7 /= 10;
                }
            }
        }
        return sum;
    }
}