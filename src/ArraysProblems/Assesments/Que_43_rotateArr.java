package ArraysProblems.Assesments;

public class Que_43_rotateArr {
    public static void main(String[] args) {
        int k = 2;
        int[] arr = {1,2,3,4,5};
        int init = arr[k];
        for (int i=0;i<arr.length;i++){
            arr[i] = init;
        }
    }
}
