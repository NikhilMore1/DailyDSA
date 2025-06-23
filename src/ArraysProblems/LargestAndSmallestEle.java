package ArraysProblems;

public class LargestAndSmallestEle {
    public static int largetNum(int [] arr){
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i] > max)
                max = arr[i];
        }
        return  max;
    }
    public static int smallestEle(int[] arr){
        int small = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<small)
                small = arr[i];
        }
        return small;
    }
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,555555,3,0,2,1,2,33333533,211};
        int ans = smallestEle(arr);
        System.out.println(ans);
    }
}