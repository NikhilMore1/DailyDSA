package EPAM.coding.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NonRepString {
    public static char get(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (char ch : arr){
            arrayList.add(ch);
        }
        for (int i = 0;i<arr.length;i++){
            map.put(arr[i], Collections.frequency(arrayList,arr[i]));
        }
        for (Map.Entry<Character,Integer>entry:map.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return 'a';
    }

    public static void main(String[] args) {
        String s = "abcab";
        System.out.println(get(s));
    }
}



//quik , merge

