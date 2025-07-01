public class ArmStrongNum {
    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 3, 4, 4, 153, 44, 433, 407};
        for (int i = 0; i < arr.length; i++) {
            int ind  = String.valueOf(arr[i]).length();
            if (armFun(arr[i], ind))
                System.out.println(arr[i]);
        }
    }

    public static boolean armFun(int ele, int n) {
        int sum = 0;
        int dummy = ele;
        while (dummy > 0) {
            int rem = dummy % 10;
            sum += Math.pow(rem, n);
            dummy /= 10;
        }

        return ele == sum;
    }
}
