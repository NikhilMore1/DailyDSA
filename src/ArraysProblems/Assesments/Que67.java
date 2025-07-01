package ArraysProblems.Assesments;

public class Que67 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int pow = 1;
        for (int i =0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                pow = pow*arr[i];
            }
        }
        System.out.println(pow);
    }
}
