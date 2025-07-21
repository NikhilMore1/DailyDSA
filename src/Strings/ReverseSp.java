package Strings;
public class ReverseSp {
    public static void main(String[] args){
        String st = "ssghghsopss";
        System.out.println(getCount(st));
    }
    public static String reverse(String str){

        //problem no 80
        char[] arr = str.toCharArray();
        int start = 0;
        int last = arr.length-1;
        while (start<last){
            if (!(Character.isLetter(arr[start]))){
                start++;
            } else if (!(Character.isLetter(arr[last]))) {
                last--;
            }else {
                char temp = arr[start];
                arr[start] = arr[last];
                arr[last] = temp;
                start++;
                last--;
            }
        }
        return new String(arr);
    }


    //problem no 78
    public static int getCount(String str){
        char[] arr = str.toCharArray();
        int start = 0;
        int last = arr.length-1;
        int count =0;
        while (start<last){
            if(arr[start] == arr[last]){
                count++;
            }
            char temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
        return count*2;
    }
}