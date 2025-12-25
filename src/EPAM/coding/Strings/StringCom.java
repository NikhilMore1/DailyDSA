package EPAM.coding.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StringCom {
    public static void strCom(String str){
        ArrayList<Character> arr = new ArrayList<>();
        for (char ch : str.toCharArray()){
            arr.add(ch);
        }
        HashMap<Character,Integer>map = new HashMap<>();
        for (int i = 0;i<str.length();i++){
            map.put(arr.get(i), Collections.frequency(arr,arr.get(i)));
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            sb.append(entry.getKey()+""+entry.getValue());
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String s = "aaabbc";
        strCom(s);
    }
}
