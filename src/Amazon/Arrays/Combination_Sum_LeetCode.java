package Amazon.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 5;
        System.out.println(sum(arr,target));
    }

    public static List<List<Integer>> sum(int[] arr,int target){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        rec(arr,target,0,new ArrayList<>(),ans);
        return ans;
    }
    public static void rec(int[] arr,int target,int start,List<Integer>current,List<List<Integer>> ans){
        if (target == 0){
            ans.add(new ArrayList<>(current));
            return;
        }
        if (target<0){
            return;
        }
        for (int i = start;i<arr.length;i++){
            current.add(arr[i]);
            rec(arr,target-arr[i],i,current,ans);
            current.remove(current.size()-1);
        }
    }
}
