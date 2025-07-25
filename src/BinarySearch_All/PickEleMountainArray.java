package BinarySearch_All;

public class PickEleMountainArray {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(searchEle(arr,target));
    }
    public static int getPickEle(int[] arr){
        int start = 0;
        int last = arr.length-1;
        while (start<last){
            int mid = (start+last)/2;
            if(arr[mid]>arr[mid+1]){
                last = mid;
            }else {
                start = mid+1;
            }
        }
        return start;
    }
    public static int searchEle(int[] arr,int target){
        int max = getPickEle(arr);
        int firstHalf = AgnosticBinarySearch(arr,0,max,target);
        if(firstHalf!=-1){
            return firstHalf;
        }

        return AgnosticBinarySearch(arr,max+1,arr.length-1,target);

    }
    public static int AgnosticBinarySearch(int[] arr, int start,int last,int target){
        boolean isAsc = arr[start] < arr[last];

        while (start<=last){
            int mid  = (start+last)/2;
            if(arr[mid] == target){
                return  mid;
            }

            if (isAsc){
                if(target < arr[mid]){
                    last = mid-1;
                }else {
                    start = mid+1;
                }
            }else {
                start = mid+1;
            }
        }
        return -1;
    }

}
