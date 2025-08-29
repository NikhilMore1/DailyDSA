package BinarySearch_All;

public class SmallestLetterGreterTTarget {
    public static char findChar(char[] arr,char target){
        int first = 0;
        int last = arr.length-1;
        char  store = '\u0000';
        if (target>arr[arr.length-1]){
            return arr[0];
        }
        while (first<=last){
            int mid = (first+last)/2;
            if (arr[mid]<target){
                first = mid+1;
            }else if(arr[mid] == target){
                store = arr[mid+1];
                return store;
            }
            else {
                store = arr[mid];
                last = mid-1;
            }
        }
        return store;
    }
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'j';
        System.out.println(findChar(arr,target));
    }
}
