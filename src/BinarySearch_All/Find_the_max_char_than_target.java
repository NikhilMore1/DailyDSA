package BinarySearch_All;

public class Find_the_max_char_than_target {
    public static void main(String[] args) {
        char[] arr ={'a','b','d','f','g'};
        char target = 'd';
        System.out.println(getChat(arr,target));
    }
    public static char getChat(char[] arr,char target){
        char ch = '\u0000';
        for(int i =0;i<arr.length;i++){
            if(target<arr[i]){
                ch = arr[i];
                break;
            }
        }
        return ch;
    }
}
