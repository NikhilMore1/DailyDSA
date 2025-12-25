package EPAM.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {
    public static char get(String str){
        char[] arr = str.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (char ele:arr){
            arrayList.add(ele);
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0;i<arr.length;i++){
            map.put(arr[i], Collections.frequency(arrayList,arr[i]));
        }
        char first = '\u0000';
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                first = entry.getKey();
                return first;
            }
        }
        return 'a';
    }
    public static int longSub(String str){
        int max = 0;
        String s = "";
        ArrayList<Character> arrayList  = new ArrayList<>();
        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            while (arrayList.contains(ch)){
                arrayList.remove(0);
            }
            arrayList.add(ch);

            if (arrayList.size()>max){
                s = "";
                max = arrayList.size();

                for (char sr : arrayList){
                   s = s+sr;
                }
            }
        }
        System.out.println(s);
        return max;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(longSub(str));
    }
}
