package ArraysProblems.Assesments;

public class MaxSumSubArray {
    public static void main(String[] args) {
        //Kadens algo
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
//        int max = Integer.MIN_VALUE;
//        for (int i = 0;i<arr.length;i++){
//            int count = 0;
//            for (int j = i;j<arr.length;j++){
////                for (int k = i;k<=j;k++){
////                    count = count+arr[k];
////                }
//                count = count + arr[j];
//            }
//            if (count>max)
//                max = count;
//        }
//        System.out.println(max);


        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            if (sum>max)
                max  =sum;

            if(sum<0)
                sum=0;
        }
        System.out.println(max);
    }
}
