package Strings;

public class DupElement {
    public static void main(String[] args) {
        String str = "Programming";
        getCount(str);
    }
    public static void getCount(String str){
        char[] arr = str.toCharArray();
        var count = 0;
        for (int i =0;i<arr.length;i++){
            int count1 = 0;
            for (int j =i;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count1++;
                }
            }
            if (count1>1){
                System.out.println(arr[i]);
        }
        }
    }
}
