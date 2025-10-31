package Amazon.Arrays;

import java.util.Arrays;

public class H_index {
    public static int find(int[] arr){
        Arrays.sort(arr);
        int i = 0;
        int size = arr.length;
        while (i<=  arr.length){
            if(arr[i]>=size){
                return size;
            }
            size--;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,0,6,1,5};
        System.out.println(find(arr));
    }
}
