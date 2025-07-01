package ArraysProblems.Assesments;

public class Que_38 {
    public static boolean checkPalindromArray(int n){
        int dummy = n;
        int sum = 0;
        while (dummy>0){
            int rem = dummy%10;
            sum = sum*10+rem;
            dummy = dummy/10;
        }

        if (n == sum)
            return  true;

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {121,223,454,666,7,8,9998,90,77,61};
        for (int i = 0;i<arr.length;i++){
            System.out.println(checkPalindromArray(arr[i]));
        }
    }
}
