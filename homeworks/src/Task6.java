import java.util.Scanner;
        import java.lang.String;

public class Task6 { // Заполнение спиралью
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a;
        int n = in.nextInt();
        a = new int[2*n+1][2*n+1];
        a[n][n] = 0;
        int prev = 1;
        if (n >= 1) {
            a[0][1] = 1;
            int i = n - 1;
            int j = n;
            int level = n - 1;
            while (i != 0 && j != 2 * n) {
                if (2 * n - level > i && i > level){
                    i--;
                }
            }
        }

        for(int i = 0; i < n * 2 + 1; i++){
            for(int j = 0; j < n * 2 + 1; j++){
                if (a[i][j] < 10){
                    System.out.print(" " + a[i][j] + " ");
                }
                else{
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}