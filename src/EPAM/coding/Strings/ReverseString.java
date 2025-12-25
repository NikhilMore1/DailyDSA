package EPAM.coding.Strings;

public class ReverseString {
    public static String reverse(String str){
        char[] arr = str.toCharArray();
        String check = str;
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);

    }

    

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverse(str));
    }
}
