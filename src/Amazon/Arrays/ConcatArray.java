package Amazon.Arrays;

import java.util.Arrays;

public class ConcatArray {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        int[] ans = new int[num.length*2];
        int k = 0;
        for (int i =0;i<ans.length;i++){
            if (k>num.length-1){
                k = 0;
            }
            ans[i] = num[k];
            k++;
        }
        System.out.println(Arrays.toString(ans));
//
//        int[] num = {1,2,3};
//        int[] ans = new int[num.length];
//
//        System.out.println(Arrays.toString(ans));
    }
}
