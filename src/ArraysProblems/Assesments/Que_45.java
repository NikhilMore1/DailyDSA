package ArraysProblems.Assesments;

public class Que_45 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean flag = false;
        int[] arr1 = {1,2,3,4,5};
        for (int i =0;i<arr.length;i++){
            if (arr[i] == arr1[i]){
                flag = true;
            }else {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
