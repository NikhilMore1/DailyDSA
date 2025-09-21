package Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HarshadNo {
    public static boolean Harshad(int num){
        int dummy = num;
        int sum = 0;
        while (num>0){
            int rem = num%10;
            sum = sum*10+rem;
            num = num/10;

        }
        int sum1 = 0;
        while (sum>0){
            int rem = sum%10;
            sum1 = sum1*10+rem;
            sum = sum/10;
        }

        System.out.println(sum1);
        if(dummy%sum1 == 0)
            return true;
        return false;
    }
    public static int fact(int num){
        if (num == 0){
            return 0;
        }
        if (num ==1){
            return 1;
        }
        return num* fact(num-1);
    }
    public static void main(String[] args) {
      int[]arr = new int[]{-1,-2,1,2,-3,4};
      for (int i = 0;i<arr.length;i++){
          if (arr[i]>0){
              for (int j = 0;j<arr.length;j++){
                  if (arr[j]<0){
                      int temp = arr[i];
                      arr[i] = arr[j];
                      arr[j] = temp;
                  }
              }
          }
      }
        System.out.println(Arrays.toString(arr));
    }
}
