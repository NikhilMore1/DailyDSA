package BinarySearch_All;

public class FloorOfNumber {
    public static int getFloor(int[] arr,int target){
        int first = 0;
        int last = arr.length-1;
        int store = 0;
        while (first<=last){
            int mid = (first+last)/2;
            if (arr[mid] == target){
                return  arr[mid];
            }
            if (arr[mid]>target) {
                last = mid - 1;
            }else {
                store = arr[mid];
                first = mid+1;
            }
        }
        return  store;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,10,12,14,15};
        int target = 7;
        System.out.println(getFloor(arr,target));
    }
}
