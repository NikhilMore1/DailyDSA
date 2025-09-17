package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class MaximumNoOFWordsType1935 {
    public static int getCount(String str,String drop){
        String[] arr = str.split(" ");
        HashSet<Character>set = new HashSet<>();
        for (char ele : drop.toCharArray()){
            set.add(ele);
        }
        int count = 0;
        for (String word : arr){
            boolean canType = true;
            for (char c : word.toCharArray()) {
                if (set.contains(c)) {
                    canType = false;
                    break;
                }
            }
            if (canType){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(getCount("Hello World","e"));
    }
}
