package Searching;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,6,6,6,7,7,7,7,9,9};
        System.out.println(getCount(arr,6));
    }
    public static int getIndexPick(int[] arr){
        int start = 0;
        int last = arr.length-1;
        while (start<=last){
            int mid = (start+last)/2;
            if(arr[mid]>arr[mid+1]){
                last = mid;
            }else {
                start = mid+1;
            }
        }
        return start;
    }
//
//    public static int getFirstIndex(int[] arr,int target){
//        int start = 0;
//        int last = arr.length-1;
//        while (start <= last){
//            int mid = (start+last)/2;
//            if(target < arr[mid]){
//                last = mid-1;
//            } else if (target > arr[mid]) {
//                start = mid+1;
//            }else if(target == arr[mid]){
//                if(target == arr[mid+1]){
//                    start = mid+1;
//                }else {
//                    return mid;
//                }
//            }
//        }
//        return -1;
//    }
        public static int getCount(int[] arr, int target) {
            int first = getFirstIndex(arr, target);
            if (first == -1) return 0; // Target not found
            int last = getLastIndex(arr, target);
            return last - first + 1;
        }

        public static int getFirstIndex(int[] arr, int target) {
            int start = 0, end = arr.length - 1;
            int result = -1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == target) {
                    result = mid;
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return result;
        }

        public static int getLastIndex(int[] arr, int target) {
            int start = 0, end = arr.length - 1;
            int result = -1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == target) {
                    result = mid;
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return result;
        }

}