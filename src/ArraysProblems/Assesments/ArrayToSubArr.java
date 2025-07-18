package ArraysProblems.Assesments;

public class ArrayToSubArr {
    public static void main(String[] args) {
        int[] arr = {10,10,20,30,40};
        for (int i =0;i<arr.length;i++){
            for (int j = 0;j<arr.length;j++){
                if (arr[i] != arr[j]){
                    System.out.println(arr[i]+": "+arr[j]);
                }
            }

        }
    }
}
