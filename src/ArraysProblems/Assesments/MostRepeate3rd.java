package ArraysProblems.Assesments;

public class MostRepeate3rd {
    public static int getValue(int[] arr){
        int max = 0;
        int max2 =max;
        int max3 = max2;
        for (int i= 0;i<arr.length;i++){
            int count = 1;
            for (int j =0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count>max){
                max3= max2;
                max2 = max;
                max = count;
            }
        }
        return  max3;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,5,6,7,8,8,8,8,9,9,9};
        System.out.println(getValue(arr));
    }
}
