package ArraysProblems.Assesments;

public class Que_20 {
    public static int getCount(int[] arr){
        int countPos = 0;
        int countNeg =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<0)
                countNeg++;
            else {
                countPos++;
            }
        }
        return countNeg;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,-6,-6,-4};
        System.out.println("Positive nums"+getCount(arr));
    }
}
