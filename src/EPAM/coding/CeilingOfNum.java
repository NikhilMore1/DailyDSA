package EPAM.coding;

public class CeilingOfNum {
    public static int getCeiling(int[] arr,int target){
        int start = 0;
        int end = arr.length;
        int ans = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid] == target){
                ans =  target;
                return ans;
            }
            if (arr[mid]<target){
                start = mid+1;
                ans = arr[mid+1];
            }if(arr[mid]>target) {
                end = mid-1;
            }

        }
        return ans;
    }

    public static char getChatCeiling(char[] arr , char target){
        int start = 0;
        int end = arr.length-1;
        char ans = arr[0];
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]>target) {
                ans = arr[mid];
                end = mid - 1;
            } else {
                start = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] arr = {1,3,4,5,6,7,9};

        char[] arr = {'a','b','c','d'};
        System.out.println(getChatCeiling(arr,'z'));
    }
}
