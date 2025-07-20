package ArraysProblems;

import java.util.Arrays;

public class GroupOfAnagrames {
    public static void main(String[] args){
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        String[][] ans = getAnagram(str);
        for(String[] a :ans){
            System.out.println(Arrays.toString(a));
        }
    }
    public static String[][] getAnagram(String[] arr){
        String[][] an = new String[6][6];
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length-1;j++){
                char[] ch = arr[j].toCharArray();
                char[] ch1 = arr[j+1].toCharArray();
                Arrays.sort(ch1);
                Arrays.sort(ch);
                if(ch.length == ch1.length){
                    for(int k = 0;k<ch.length;k++){
                        if(ch[k] == ch1[k]){
                            String s1 = String.copyValueOf(ch);
                            String s2 = String.copyValueOf(ch1);
                            an[i][i] = s1;
                            an[i][j] = s2;
                        }
                    }
                }
            }
        }
        return an;
    }
}
