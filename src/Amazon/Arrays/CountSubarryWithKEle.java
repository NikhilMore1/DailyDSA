package Amazon.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountSubarryWithKEle {
    public static int getSubArrayCount(int[] arr,int k){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int ele:arr){
            arrayList.add(ele);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<arr.length;i++){
            map.put(arrayList.get(i), Collections.frequency(arrayList,arrayList.get(i)));
        }
        int max = 0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()>max){
                max = entry.getKey();
            }
        }
        ArrayList<ArrayList<Integer>> coll = new ArrayList<>();
        for (int i = 0;i<arr.length-1;i++){
            ArrayList<Integer> sub = new ArrayList<>();
            int c = 0;
            sub.add(arr[i]);
            if (arr[i] == max){
                c++;
            }
            for (int j = i+1;j<arr.length;j++){
                if (sub.contains(max)){
                    c++;
                }
                if (c==k && !coll.contains(sub)){
                    coll.add(sub);
                }
                sub.add(arr[j]);
            }
            System.out.println(sub);
        }
        System.out.println(coll);
        return coll.size();
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2,3,3};
        System.out.println(getSubArrayCount(arr,2));
    }
}
