package EPAM.coding.ArrayList;

public class MissingNum {
    public static int missNum(int[] nums){
        int len = nums.length;
        int act = len*(len+1)/2;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
        }
        System.out.println(sum);
        int diff = act-sum;
        return diff;
    }

    public static void main(String[] args) {
        int[] arr = {3,0,1,4};
        System.out.println(missNum(arr));
    }
}
