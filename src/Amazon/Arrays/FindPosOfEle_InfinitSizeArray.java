package Amazon.Arrays;

public class FindPosOfEle_InfinitSizeArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,16};
        int target = 16;
        System.out.println(find(arr,0,1,target));
    }
    public static int getIndex(int[] arr,int start,int last,int target,int idx){
        while (start <= last){
            int mid = (start+last)/2;
            if(target<arr[mid]){
                last = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else {
                idx = mid;
                break;
            }
        }
        return idx;
    }
    public static int find(int[] arr,int start,int last,int target){
        int val = arr[0];
        while (val < target){
            start = last;
            last = 2*last;
            val = arr[last];
        }
        return getIndex(arr,start,last,target,0);
    }
}
