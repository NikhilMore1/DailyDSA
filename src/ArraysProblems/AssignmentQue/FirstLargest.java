package ArraysProblems.AssignmentQue;

public class FirstLargest {
    public static int getlarge(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i= 0;i<arr.length;i++){
            if (arr[i]>max)
                max = arr[i];
        }
        return max;
    }

    public static int getSmall(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min)
                min = arr[i];
        }
        return min;
    }

    public static int get2Small(int[] arr){
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min2 = min;
                min = arr[i];
            } else if (arr[i] < min2 && arr[i] != min) {
                min2 = min;
            }
        }
        if (min2 == Integer.MAX_VALUE){
            System.out.println("No sec max all are same");
        }

        return min2;

    }



    public static int getSecMax(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }else if (arr[i] > max2 && arr[i] != max1){
                max2 = arr[i];
            }
        }
        return  max2;
    }
    public static void main(String[] args) {
        int[] arr = {9,2,-3,4,5,6,9,7};
        System.out.println(getSecMax(arr));
    }
}
