package ArraysProblems.AssignmentQue;

public class FindFact {
    public static int getFact(int n){
        if (n==0||n==1) {
            return 1;
        }
        return n * getFact(n-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i = 0;i<arr.length;i++){
            System.out.println(getFact(arr[i]));
        }
//        System.out.println(getFact(10));
    }
}
