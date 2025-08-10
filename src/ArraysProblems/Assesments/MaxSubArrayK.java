package ArraysProblems.Assesments;

import java.util.ArrayList;

public class MaxSubArrayK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k =3;
        System.out.println(  getSub(arr,k));
    }
    public static int getSub(int[] arr,int k) {
        int max = 0;
        for (int i = 0;i<arr.length;i++){
            for (int j = k-1;j<arr.length;j++){
                int sum = 0;
                ArrayList<Integer> arrayList = new ArrayList<>();
                for (int m = i;m<=j;m++){
                    sum = sum+arr[m];
                    if (max<sum){
                        max = sum;
                        arrayList.add(arr[m]);
                    }
                }
                System.out.println(arrayList);

                i++;
                k++;
            }
        }
       return max;
    }
}
