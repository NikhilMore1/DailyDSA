package BinarySearch_All;

public class CeilingOfNumber {
    public static int findCeiling(int[] arr,int target){
        int first = 0;
        int last = arr.length-1;
        int store = 0;
        while (first<=last){
            int mid = (first+last)/2;
            if (arr[mid]<target){
                first = mid+1;
            }else {
                store = arr[mid];
                last = mid-1;
            }
        }
        return store;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,10,66,146};
        int target = 65;
        System.out.println(findCeiling(arr,target));
    }
}
