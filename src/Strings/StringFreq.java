package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StringFreq {
    public void getStr(String str){
        ArrayList<String> arr = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0;i<str.length();i++){
            arr.add(String.valueOf(str.charAt(i)));
        }
        for (String a : arr){
            int fre = Collections.frequency(arr,a);
            map.put(a,fre);
        }
        System.out.println(map);
        ArrayList<String> arrayList = new ArrayList<>();
        int max = Collections.max(map.values());
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue() == max){
                arrayList.add(entry.getKey());
            }
        }
        System.out.println(arrayList);
    }

    public static void main(String[] args) {
        StringFreq obj = new StringFreq();
        obj.getStr("google");
    }
}
