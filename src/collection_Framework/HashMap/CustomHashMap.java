package collection_Framework.HashMap;
import java.util.*;
public class CustomHashMap {
    public static boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        ArrayList<Integer>arr = new ArrayList<>();
        for(int ele : nums){
            arr.add(ele);
        }
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],Collections.frequency(arr,nums[i]));
        }
        boolean flag = true;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if (entry.getValue()>=1){
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,5,5};
        System.out.println(hasDuplicate(arr));
    }
}