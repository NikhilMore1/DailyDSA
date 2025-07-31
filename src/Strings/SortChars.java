package Strings;

public class SortChars {
    public static void main(String[] args) {
        String str = "ABNIOASDF";
        System.out.println(getSort(str));
    }
    public static String getSort(String str){
        char[] arr = str.toCharArray();
        for (int i =0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String ans = new String(arr);
        return ans;
    }
}
