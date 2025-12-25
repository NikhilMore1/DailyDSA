package EPAM.coding.ArrayList;

public class SecMaxEle {
    public static int getMax(int[] arr){
        int max = 0;
        int sec = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>max){
                sec = max;
                max = arr[i];
            }
            if (arr[i]>sec && arr[i] != max){
                sec = arr[i];
            }
        }
        return sec;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,8,7,6,5,4,3,8,9,1,0,22,33,44,445};
        System.out.println(getMax(arr));
    }
}
