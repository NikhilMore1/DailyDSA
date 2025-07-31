package Strings;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "nikhil";
        System.out.println(getString(str));
    }
    public static String getString(String str){
        if (str.length() == 0){
            return null;
        }
        char[] arr = str.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i =0;i<arr.length;i++){
            if (!(arrayList.contains(arr[i]))){
                arrayList.add(arr[i]);
            }
        }
        String ans ="";
        for (char ele : arrayList){
            ans = ans+ele;
        }
        return ans;
    }
}
