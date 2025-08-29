package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupOfAnagrams {
    public static ArrayList<ArrayList<String>> get(String[] arr){
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        for (int i = 0;i<arr.length;i++){
            ArrayList<String>an = new ArrayList<>();
            for (int j = i;j<arr.length;j++){
                char[] iele = arr[i].toCharArray();
                char[] jele = arr[j].toCharArray();
                Arrays.sort(iele);
                Arrays.sort(jele);
                if (Arrays.equals(iele,jele)){
                    an.add(arr[j]);
                }
            }
            if (!ans.contains(an)){
                    ans.add(an);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(get(arr));
    }
}
