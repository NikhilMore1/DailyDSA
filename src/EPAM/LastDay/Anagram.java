package EPAM.LastDay;

public class Anagram {
    public static boolean ana(String s1 , String s2){
        int[] count = new int[256];
        if (s1.length() != s2.length()){
            return false;
        }
        for (int i = 0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;

        }
        for (int ele : count){
            if (ele != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ana("hellf","ollhe"));
    }
}
