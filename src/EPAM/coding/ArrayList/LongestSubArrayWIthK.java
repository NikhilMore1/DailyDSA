package EPAM.coding.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestSubArrayWIthK {
    public static ArrayList<Integer> get(int[] arr , int k) {
        ArrayList<Integer> longest = new ArrayList<>();
        for (int i = 0;i<arr.length;i++){
            int sum = 0;
            ArrayList<Integer> curr = new ArrayList<>();
            for (int j = i;j<arr.length;j++){
                sum = sum+arr[j];
                curr.add(arr[j]);
                if (sum == k){
                    if (longest.size()<curr.size()){
                        longest = new ArrayList<>(curr);
                    }
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(get(arr,3));
    }
}
