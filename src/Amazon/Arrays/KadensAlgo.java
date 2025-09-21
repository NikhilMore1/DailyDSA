package Amazon.Arrays;

import java.util.ArrayList;

public class KadensAlgo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(getSum(arr));
    }
  public static int getSum(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            int sum = 0;
            for (int j = i;j<arr.length;j++){
                sum = sum+arr[j];
            }
            if (max<sum){
                max = sum;
            }
        }
        return max;
  }
}
