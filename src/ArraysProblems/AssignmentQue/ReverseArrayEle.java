package ArraysProblems.AssignmentQue;

public class ReverseArrayEle {
    public static void main(String[] args) {
        int[] arr = {12,33,45,56,98};
        int temp = 0;
        for (int i = 0;i<arr.length;i++){
            temp = arr[i];
            int sum = 0;
            while (temp>0){
                int rem = temp%10;
                sum = sum*10+rem;
                temp = temp/10;
            }
            System.out.println(sum);
        }
    }
}
