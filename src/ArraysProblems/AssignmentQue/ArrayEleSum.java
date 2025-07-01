package ArraysProblems.AssignmentQue;

public class ArrayEleSum {
    public static int getSum(int[] arr){
         int sum = 0;
         for (int i =0;i<arr.length;i++){
             sum = sum+arr[i];
         }
         return  sum;

    }
    public static int[] getRev(int[] arr){
        int i = 0;
        int temp = 0;
        int j = arr.length-1;
        while (i<=j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }

    public static int getProduct(int[] arr){
        int prod = 1;
        for (int i=0;i<arr.length;i++){
            prod = arr[i]*prod;
        }
        return  prod;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        int[] method = getRev(arr);
//        for (int ele:method){
//            System.out.println(ele);
//        }
//        System.out.println(getEvenOdd(arr));

        System.out.println(getProduct(arr));

    }
}
