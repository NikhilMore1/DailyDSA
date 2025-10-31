package Amazon.Arrays;

public class RemoveDup {
    public static String get(String str){
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<arr.length;i++){
            if (!sb.toString().contains(String.valueOf(arr[i]))){
                sb.append(arr[i]);
            }else {
                continue;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(get("bcabc"));
    }
}
