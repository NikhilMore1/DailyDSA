package ArraysProblems;

public class ArrayElementRev {
    public static void main(String[] args) {
        int[] arr = {12,334,56,78,90};
        for (int i=0;i<arr.length;i++){
            System.out.println(reverse(arr[i]));
        }
    }
    public static int reverse(int ele){
        int sum = 0;
        while (ele>0){
            int rem = ele%10;
            sum = sum*10+rem;
            ele = ele/10;
        }
        return sum;
    }
}
