package Amazon.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] num = {2,5,1,3,4,7};
        int n = num.length/2;
        int i = 0;
        int j = n;
        int k =0;
        int[] ans = new int[num.length];
        while (j<num.length){
            ans[k] = num[i];
            k++;
            ans[k] = num[j];
            k++;
            i++;
            j++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
