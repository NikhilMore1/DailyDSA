package collection_Framework.HashMap;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,56,6,7,2,3,4,4,4,5,5,5,5,5,5,5,6,7,8,9};
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int ele :arr){
            arrayList.add(ele);
        }
        for (int i = 0;i<arrayList.size();i++){
            map.put(arrayList.get(i), Collections.frequency(arrayList,arrayList.get(i)));
        }
        int v = 0;
        int k = 0;
       for (Map.Entry<Integer,Integer>entry:map.entrySet()){
           if(entry.getValue()>v){
               v = entry.getValue();
               k = entry.getKey();
           }
       }
        System.out.println(v);
        System.out.println(k);
    }
}
