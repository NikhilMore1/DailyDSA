import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Demo{
    public static void get(int[] arr){
        int[] ans = new int[arr.length];
        for (int i = 0;i<arr.length;i++){
            int mul = 1;
            for (int j = 0;j<arr.length;j++){
                if(i!=j){
                    mul = mul*arr[j];
                }else {
                    continue;
                }
            }
            ans[i] = mul;
        }
        System.out.println(Arrays.toString(ans));
    }

    public static void get1(int[] arr){
        int mul = 1;
        for (int i = 0;i<arr.length;i++){
            mul = mul*arr[i];
        }
        for (int i = 0;i<arr.length;i++){
            arr[i] = mul/arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }


    public static boolean wordBreak(String s, List<String> dict){
        for (int i = 0;i<dict.size();i++){
            if (!s.contains(dict.get(i))){
                return  false;
            }
        }
        return true;
    }

    public static void maxProd(int[] arr){
        int max = Integer.MIN_VALUE;
        int c = arr[arr.length-1];
        for (int i = 0;i<arr.length-1;i++) {
           if(arr[i]>max){
                max = arr[i];
            }else if(arr[i+1]>max){
                max = arr[i+1];
            }else if(arr[i]*arr[i+1]>max){
                max = arr[i]*arr[i+1];
            }
        }
        System.out.println(max);
    }


    public static void fun1(int[] arr) {
        int max = 1;
        for (int i = 0;i<arr.length;i++){
            max *= arr[i];
        }
        for (int i = 0;i<arr.length;i++){
            arr[i] = max/arr[i];
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

        int[] arr = new int[]{2,3,4,5};
        fun1(arr);
    }
}