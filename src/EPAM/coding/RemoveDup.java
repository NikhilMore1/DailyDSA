package EPAM.coding;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDup {
    public static int[] remove(int[] arr) {
        int[] ans = new int[arr.length];
        Arrays.sort(arr);
        int i = 0;
        int id = 0;
        while (i<arr.length-1){
            if (arr[i] == arr[i+1]){
                ans[id++] = arr[i];
                i = i+2;
            }else {
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,1,2,3,3,33,3,3,3,3,33,33};
        System.out.println(Arrays.toString(remove(arr)));
    }
}
