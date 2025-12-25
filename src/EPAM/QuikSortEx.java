package EPAM;

import java.util.Arrays;

public class QuikSortEx {
    public static void quickSort(int[] arr,int low,int high){
        if (low<high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int i = low-1;
        int piv = arr[high];
        for (int j = low;j<arr.length;j++){
            if (arr[j]<piv){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void main(String[] args) {
     int[] arr = {6,5,42,1,2};
     quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
