package Amazon.Arrays;

import java.util.*;

public class Single_Num {
    public static int getNum(int[] nums){
        int num = 0;
        Map<Integer,Integer> hashmap = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int n:nums){
            arr.add(n);
        }
        for (int i = 0;i<arr.size();i++){
            hashmap.put(nums[i] , Collections.frequency(arr,nums[i]));
        }
        for(Map.Entry entry : hashmap.entrySet()){
            if(entry.getValue().equals(1)){
                num = (Integer)entry.getKey();
            }
        }
        return num;
    }

    public static int get(int[] arr){
        int num = 0;
        Arrays.sort(arr);
        for (int i = 0;i<arr.length-1;i++){
            if(arr[i]!= arr[i+1]){

            }
        }
        System.out.println(Arrays.toString(arr));
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(get(new int[]{4,1,2,1,2}));
    }
}
