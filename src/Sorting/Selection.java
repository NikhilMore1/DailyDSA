package Sorting;
import java.util.Arrays;

public class Selection {
    public static void selection_sort(int[] arr){
        for (int i = 0;i<arr.length;i++){
            int last = arr.length-1-i;
            int max = getMax(arr, 0,last);
            swap(arr,max,last);
        }
    }
    public static  int getMax(int[] arr,int first, int last){
        int max = 0;
        for (int i  =first;i<=last;i++){
            if(arr[max]<arr[last])
                max = i;
        }
        return  max;
    }
    public static void swap(int[] arr , int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void  selection(int[] arr){
        for (int i = 0;i<arr.length;i++){
            int max = getmaxEle(arr,0,arr.length-1-i);
            swapEle(arr,max,arr.length-1-i);
        }
    }
    public static int getmaxEle(int[] arr,int first,int last){
        int max = 0;
        for (int i =first;i<=last;i++){
            if(arr[i]<max){
                max = i;
            }
        }
        return max;
    }
    public static void swapEle(int[] arr,int max,int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}