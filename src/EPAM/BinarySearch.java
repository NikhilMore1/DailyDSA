package EPAM;

import java.util.Arrays;

public class BinarySearch {
    public static  boolean binarySearch(int[] arr,int target){
        Arrays.sort(arr);
        int first = 0;
        int last = arr.length-1;
        while (first<=last){
//            int mid = (first+last)/2;
            int mid = first+(last-first)/2;
            if (arr[mid] == target){
                return true;
            }
            if (arr[mid]<target){
                first = mid+1;
            }
            else {
                last = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 5;
        System.out.println(binarySearch(arr,target));
    }
}
