package Searching;

public class Binary {
    public static int getIndex(int [] arr ,int target){
        int start = 0;
        int last = arr.length-1;
        while (start<=last){
            int mid = (start+last)/2;
            if(target == arr[mid]){
                return mid;
            }else if(target > arr[mid]){
                start = mid+1;
            }else {
                last = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 1;
        System.out.println(getIndex(arr,target));
    }
}
