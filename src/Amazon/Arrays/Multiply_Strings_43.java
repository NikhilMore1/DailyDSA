package Amazon.Arrays;

import java.math.BigInteger;
import java.util.Arrays;

public class Multiply_Strings_43 {
    public static int multiply(int[] arr){
        Arrays.sort(arr);
        int maxArea = 0;
        for (int i = 0;i<arr.length-2;i++){
            int a = arr[i];
            int b = arr[i+1];
            int c = arr[i+2];
            if (a+c>b && a+b>c && b+c>c){
                int per = a+b+c;
                maxArea = Math.max(per,maxArea);
                System.out.println(maxArea);
            }
        }
       return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,3,4};
        System.out.println(multiply(arr));
    }
}
