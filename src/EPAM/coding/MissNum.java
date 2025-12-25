package EPAM.coding;

public class MissNum {
    public static int miss(int[] arr){
        int acc = arr.length*(arr.length+1)/2;
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        int diff = acc - sum;
        return diff;
    }

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(miss(arr));
    }
}
