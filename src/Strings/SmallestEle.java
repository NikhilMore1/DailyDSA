package Strings;

public class SmallestEle {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'c';
        System.out.println(get(arr,target));
    }
    public static char get(char[] arr,char target){
      char ch = 127;
      for (char i:arr){
          if (ch > i){
              ch = i;
          }
          if(target > i){
              ch = arr[0];
          }
      }
      return ch;
    }
}
