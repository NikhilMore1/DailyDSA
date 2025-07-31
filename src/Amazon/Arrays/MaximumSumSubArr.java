package Amazon.Arrays;
import  java.util.*;
public class MaximumSumSubArr {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,2,1};
        int k = 3;
        System.out.println(getSum(arr,k));
    }
    public static int getSum(int[] arr,int size){
        int sum = 0;
        ArrayList<Integer>arrayList = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            int temp = 0;
            for(int j = i;j<size;j++){
                temp = temp+arr[j];
                if (temp>sum){
                    sum = temp;
                    arrayList.add(arr[j]);
                }
            }

            if (!(arr.length<=size)){
                size = size+1;
            }
        }
        System.out.println(arrayList);
        return sum;
    }
}
