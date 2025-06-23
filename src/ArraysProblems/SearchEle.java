package ArraysProblems;

public class SearchEle {
    public static boolean search(int[] arr , int n){
        for (int i=0;i<arr.length;i++){
            if(arr[i] == n)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,55,66,435};
        int n = 566;
        System.out.println(search(arr,n)?"Element is found":"not found");
    }
}
