import java.util.Scanner;
import java.lang.String;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rabbits = 11;
        int wolves = 2;
        int dead = 0;
        int current = 1;
        while (current <= n){
            if (current % 2 == 0){
                for(int i = 0; i < wolves; i++){
                    if (rabbits < 10){
                        wolves--;
                    }
                    else{
                        rabbits -= 10;
                        dead += 10;
                        if (dead >= 70){
                            dead -= 70;
                            wolves++;
                        }
                    }
                }
            }
            if (current % 2 == 1){
                if (rabbits * 3 <= 19000000){
                    rabbits *= 3;
                }
            }
            current++;
        }
        System.out.println(rabbits + " " + wolves);
    }
}