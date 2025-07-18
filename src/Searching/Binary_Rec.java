package Searching;

public class Binary_Rec {
    public static int binary(int[] arr ,int key ,int start,int end,int mid) {
        mid = (start + end) / 2;
        if (start > end) {
            return -1;
        }
        if (key == arr[mid]) {
            return mid;
        } else if (key > arr[mid]) {
            binary(arr, key,++start, end, mid);
        } else {
            binary(arr, key, start,--end, mid);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 4;
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        int pos = binary(arr,target,start,end,mid);
        System.out.println(pos);
    }
}
