package EPAM.coding.Strings;

public class ReverseWord {
    public static void reverse(String s){
        String[] arr = s.split(" ");
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String sr = "";
        for (String ss : arr){
            sr = sr+ss+" ";
        }
        System.out.println(sr);
    }

    public static void main(String[] args) {
        String s = "Hello Nikhil How are you ";
        reverse(s);
    }
}
