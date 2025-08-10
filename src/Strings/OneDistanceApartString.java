package Strings;

public class OneDistanceApartString {
    public static void main(String[] args) {
        String a = "abc";
        String aa = "abc";
        System.out.println(check(a,aa));
    }
    public static boolean check(String str1,String str2){
        char[] arr = str1.toCharArray();
        char[] arr1 = str2.toCharArray();
        if (str1.length()>str2.length()){
            for (int i = 0;i<arr.length;i++){
                if (!(str2.contains(String.valueOf(arr[i])))){
                    str2.concat(arr[i]+"");
                    return true;
                } else if (arr[i] != str2.charAt(i)) {
                    arr1[i] = arr[i];
                    return true;
                }else {
                    return false;
                }
            }
        }
        return false;
    }
}
