package Recurssion;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,2,5,6};
        System.out.println(check(arr,0));
    }
    public static boolean check(int[] arr, int i){
        if(i>=arr.length-1){
            return true;
        }
        if (arr[i]<=arr[i+1]){
            return  check(arr,++i);
        } else if (arr[i]>arr[i+1]) {
            return false;
        }
        return false;
    }
}
