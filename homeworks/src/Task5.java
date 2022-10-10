import java.util.Scanner;
import java.lang.String;

public class Task5 { // Заполнение змейкой
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a;
        int n = in.nextInt();
        int m = in.nextInt();
        a = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (i % 2 == 0){
                    a[i][j] = j + i * m;
                }
                else{
                    a[i][j] = (i + 1) * m - j - 1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
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