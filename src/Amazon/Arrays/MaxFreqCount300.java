package Amazon.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxFreqCount300 {
    public static int getCount(int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int ele:arr){
            arrayList.add(ele);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<arr.length;i++){
            map.put(arrayList.get(i), Collections.frequency(arrayList,arr[i]));
        }
        int max = 0;
        for (Map.Entry<Integer,Integer>entry : map.entrySet()){
            if (entry.getValue()>max){
                max = entry.getValue();
            }
        }
        int count = 0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue() == max){
                count = count+entry.getValue();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,4,5,5};
        System.out.println(getCount(arr));
    }
}
