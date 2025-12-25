package EPAM.coding;

import java.util.Arrays;

public class BinarySearchh {
    public static int search(int[] arr , int target){
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] > target){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return -1;
    }
    public static int[] occurence(int[] arr , int k){
        int[] ans = {-1,-1};
        int left = 0;
        int right = arr.length-1;
        Arrays.sort(arr);
        while (left<=right){
            int mid = (left+right)/2;
            if (arr[mid] == k){
                if (arr[mid+1] != k){
                    ans[1] = mid;
                    right = mid-1;
                }
                if (arr[mid-1] != k){
                    ans[0] = mid;
                    left = mid+1;
                }
            }
            if (arr[mid]>k){
                right = mid-1;
            }
            else {
                left = mid+1;
            }

        }
        return ans;
    }

    public static int peak(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            int mid = (left+right)/2;
            if (arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                    return mid;
            }
            if (arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]){
                right = mid-1;
            }
            if (arr[mid]<arr[mid+1]){
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,3,2,1};
        System.out.println(Arrays.toString(occurence(arr,4)));
    }
}
