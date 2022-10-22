import java.util.Scanner;
import java.lang.String;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String word;
        byte [] bytes = new byte[len];
        for(int i = 0; i < len; i++){
            word = in.next();
            if (word.charAt(0) == 't'){
                bytes[i] = (1 << 0);
            }
            else{
                bytes[i] = (0 << 0);
            }
            for(int j = 1; j <= len; j++) {
                bytes[i] = (byte) (0 << j);
            }
        }
        for(byte b: bytes){
            if( (Byte.toString(b)).charAt(0) == '0'){
                System.out.print("True ");
            }
            else{
                System.out.print("False ");
            }
        }
    }
}