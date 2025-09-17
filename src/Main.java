import java.util.Arrays;
import java.util.*;
public class Main {
    public static int getMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length;i++){
            if (arr[i]>max){
                max1 = max;
                max = arr[i];

            }else if(arr[i]<max && arr[i]>max1){
                max1 = arr[i];
            }
        }
        return (max1==Integer.MIN_VALUE?-1:max1);
    }
    public static boolean isSorted(int[] arr){
        boolean flag = true;
        for (int i = 0;i<arr.length;i++){
            for (int j = i;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    flag = false;
                    return flag;
                }
            }
        }
        return flag;
    }
    public static int[] reverseArray(int[] arr){
        int[] dummy = new int[arr.length+1];
        int id = 0;
        for (int i = arr.length-1;i>=0;i--){
            dummy[id++] = arr[i];
        }
        return dummy;
    }
    public static int[] rotateKSteps(int[] arr,int k){
        int[] dummy = new int[arr.length];
        int id = 0;
        int[] kArr = new int[k+1];
        if (k >arr.length){
            return  reverseArray(arr);
        }
        for (int i = 0;i<=k;i++){
            kArr[i] = arr[i];
        }
        for (int i = k+1;i<arr.length;i++){
            dummy[id++] = arr[i];
        }
        int count  =0;
        for (int i = id;i<dummy.length;i++){
            dummy[id++] = kArr[count++];
        }
        return dummy;
    }
    public static int missednumber(int[] arr){
        int n = arr.length;
        int total = (n+1)*(n+2)/2;
        int sum = 0;
        for (int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        return total - sum;
    }
    public static int[] sumIndex(int[] arr,int target){
        int[] ans = new int[2];
        for (int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if (arr[i]+arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
    public static int[] moveZero(int[] arr){
        for (int i = 0;i<arr.length;i++){
           for (int j = 0;j<arr.length-1;j++){
               if (arr[j] == 0){
                   int temp = arr[j+1];
                   arr[j+1] = arr[j];
                   arr[j] = temp;
               }
           }
        }
        return arr;
    }
    public static int maxSumSubArray(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            currSum = currSum+arr[i];
            maxSum = Math.max(currSum,maxSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static int[] productExceptSelf(int[] arr){
        int[] ans = new int[arr.length];
        int id =0;
        for (int i = 0;i<arr.length;i++){
            int prod = 1;
            for (int j = 0;j<arr.length;j++){
                if(!(i==j)){
                    prod = prod*arr[j];
                }
            }
            ans[id++] = prod;
        }
        return ans;
    }
    public static HashSet<Integer> findDup(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> ans1 = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<arr.length;i++){
            ans.add(arr[i]);
        }
        for (int i  = 0;i<arr.length;i++){
          map.put(arr[i],Collections.frequency(ans,arr[i]));
          if (Collections.frequency(ans,arr[i])>1){
              ans1.add(arr[i]);
          }
        }
        return ans1;
    }
    public static int containerWithMostWater(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int maxArea = 0;
        while (left<right){
            int area = Math.min(arr[left],arr[right])*(right-left);
            maxArea = Math.max(maxArea,area);

            if (arr[left]<arr[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
   public static boolean isPalindrome(String str){
        String temp = str.toLowerCase();
        int left = 0;
        int right = temp.length()-1;
        while (left<=right){
           if (Character.isLetter(temp.charAt(left)) && Character.isLetter(temp.charAt(right))) {
               if (temp.charAt(left) == temp.charAt(right)) {
                   left++;
                   right--;
               } else {
                   return false;
               }
           } else if (!Character.isLetter(temp.charAt(left))) {
               left++;
           }else {
               right--;
           }
        }
        return true;
   }
   public static int longestStringlength(String str){
        LinkedList<String> arr = new LinkedList<>();
        arr.add(String.valueOf(str.charAt(0)));
        for (int i = 1;i<str.length();i++){
            if(!(arr.get(0).equals(String.valueOf(str.charAt(i))))){
                arr.add(String.valueOf(str.charAt(i)));
                System.out.println(String.valueOf(str.charAt(i)));
            }else {
                return arr.size();
            }
        }
        return arr.size();
   }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        String str = "pwwkew";
        System.out.println(longestStringlength(str));
    }
}