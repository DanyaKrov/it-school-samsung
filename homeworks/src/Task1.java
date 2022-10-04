import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n = in.nextInt();
        String s = "";
        String num_s = Integer.toString(num);
       for (char x : num_s.toCharArray()){
            if (Character.getNumericValue(x) != n){
                s += x;
            }
        }
        System.out.println(s);
    }
}