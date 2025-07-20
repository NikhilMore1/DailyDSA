package BinarySearch_All;

public class FloorOfTarger {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(getFloor(arr,target));
    }
    public static int getFloor(int[] arr,int target){
        int start = 0;
        int last = arr.length-1;
        while (last>start){
            int mid = (start+last)/2;
            if(arr[mid] == target){
                return arr[mid];
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else {
                last = mid-1;
            }
        }
        return arr[last];
    }
}
