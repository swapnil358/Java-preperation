package JAVA.Programs.javaPrograme1;

import java.util.Arrays;

public class MissingNumber2 {

    public static void main(String[] args) {
        System.out.println(method());

    }

    public static int method(){
        int[] num = {2, 1, 4, 0, 5};

        Arrays.sort(num);   // After sort -  [0, 1, 2, 4, 5]

        for(int i=0; i<num.length; i++){

            if(num[i] != i){
                return i;

            }
        }


        return 0;
    }
}
