import java.util.Scanner;
import java.lang.String;

public class Task4 { // таблица умножения
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a;
        int n = in.nextInt();
        int m = in.nextInt();
        a = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = i * j;
            }
        }
    }
}