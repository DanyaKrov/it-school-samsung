import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

class MyArrays{
    public static double avgOf4Digit(int[] list1){
        int arth = 0;
        int count = 0;
        for(int i: list1){
            if (i > 999 && i < 10000){
                arth += i;
                count ++;
            }
        }
        if (count > 0){
            return arth / count;
        }
        else{
            return -1.00;
        }
    }

    public static int[] minToBegin(int[] list1){
        if (list1.length == 0){
            return new int[]{-1};
        }
        int min = 999999;
        int index = 0;
        for(int i = 0; i <  list1.length; i++){
            if (list1[i] < min){
                min = list1[i];
                index = i;
            }
        }
        int[] new_list1 = new int[list1.length];
        new_list1[0] = min;
        for(int i = 1; i <  list1.length; i++){
            if ((i - 1) != index){
                new_list1[i] = list1[i - 1];
            }
        }
        return new_list1;
    }
}