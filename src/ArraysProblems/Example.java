package ArraysProblems;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,6,4,3,2,7};
        System.out.println(Arrays.toString(arr));
        boolean[] b = new boolean[arr.length];
        for (int i=0;i<arr.length;i++){
            if (b[i])
                continue;
            int cnt = 0;
            for (int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]&& b[j] == false){
                    cnt++;
                    b[j] = true;
                }
            }
//            System.out.print(arr[i]+" :"+cnt);
            if (cnt ==  1){
                System.out.println(arr[i]);
            }

        }
    }
}