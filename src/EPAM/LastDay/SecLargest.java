package EPAM.LastDay;

public class SecLargest {
    public static int second(int[] arr){
        int sec = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i =0;i<arr.length;i++){
            if (arr[i]>max){
                sec = max;
                max = arr[i];
            }
            if (arr[i]>sec && arr[i] !=max){
                sec = arr[i];
            }
        }
        return sec;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(second(arr));
    }
}
