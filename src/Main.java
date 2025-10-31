import java.util.Arrays;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max1 = max;
                max = arr[i];

            } else if (arr[i] < max && arr[i] > max1) {
                max1 = arr[i];
            }
        }
        return (max1 == Integer.MIN_VALUE ? -1 : max1);
    }

    public static boolean isSorted(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    flag = false;
                    return flag;
                }
            }
        }
        return flag;
    }

    public static int[] reverseArray(int[] arr) {
        int[] dummy = new int[arr.length + 1];
        int id = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            dummy[id++] = arr[i];
        }
        return dummy;
    }

    public static int[] rotateKSteps(int[] arr, int k) {
        int[] dummy = new int[arr.length];
        int id = 0;
        int[] kArr = new int[k + 1];
        if (k > arr.length) {
            return reverseArray(arr);
        }
        for (int i = 0; i <= k; i++) {
            kArr[i] = arr[i];
        }
        for (int i = k + 1; i < arr.length; i++) {
            dummy[id++] = arr[i];
        }
        int count = 0;
        for (int i = id; i < dummy.length; i++) {
            dummy[id++] = kArr[count++];
        }
        return dummy;
    }

    public static int missednumber(int[] arr) {
        int n = arr.length;
        int total = (n + 1) * (n + 2) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return total - sum;
    }

    public static int[] sumIndex(int[] arr, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    public static int[] moveZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == 0) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int maxSumSubArray(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static int[] productExceptSelf(int[] arr) {
        int[] ans = new int[arr.length];
        int id = 0;
        for (int i = 0; i < arr.length; i++) {
            int prod = 1;
            for (int j = 0; j < arr.length; j++) {
                if (!(i == j)) {
                    prod = prod * arr[j];
                }
            }
            ans[id++] = prod;
        }
        return ans;
    }

    public static HashSet<Integer> findDup(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> ans1 = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], Collections.frequency(ans, arr[i]));
            if (Collections.frequency(ans, arr[i]) > 1) {
                ans1.add(arr[i]);
            }
        }
        return ans1;
    }

    public static int containerWithMostWater(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;
        while (left < right) {
            int area = Math.min(arr[left], arr[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static boolean isPalindrome(String str) {
        String temp = str.toLowerCase();
        int left = 0;
        int right = temp.length() - 1;
        while (left <= right) {
            if (Character.isLetter(temp.charAt(left)) && Character.isLetter(temp.charAt(right))) {
                if (temp.charAt(left) == temp.charAt(right)) {
                    left++;
                    right--;
                } else {
                    return false;
                }
            } else if (!Character.isLetter(temp.charAt(left))) {
                left++;
            } else {
                right--;
            }
        }
        return true;
    }

    public static int longestStringlength(String str) {
        LinkedList<String> arr = new LinkedList<>();
        arr.add(String.valueOf(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (!(arr.get(0).equals(String.valueOf(str.charAt(i))))) {
                arr.add(String.valueOf(str.charAt(i)));
                System.out.println(String.valueOf(str.charAt(i)));
            } else {
                return arr.size();
            }
        }
        return arr.size();
    }

    public static int[] getRotateLeft(int[] arr, int k) {
        int[] ans = new int[arr.length];
        int[] first = new int[k];
        for (int i = 0; i < k; i++) {
            first[i] = arr[i];
        }
        int id = 0;
        for (int i = k; i < arr.length; i++) {
            ans[id++] = arr[i];
        }
        int count = 0;
        for (int i = id; i < ans.length; i++) {
            ans[id++] = first[count++];
        }
        return ans;
    }

    public static int[] getRotatedRight(int[] arr, int k) {
        int[] ans = new int[arr.length];
        int[] first = new int[k];
        int id = 0;
        for (int i = arr.length - 1; i > k; i--) {
            first[id++] = arr[i];
        }
        int count = 0;
        for (int i = 0; i < first.length; i++) {
            ans[count++] = first[i];
        }
        int j = 0;
        for (int i = count; i < ans.length; i++) {
            ans[i] = arr[j++];
        }
        return ans;
    }

    //    public static String longestCommonPrefix(String[] arr){
//        String ans = "";
//
//    }
    public static List<Integer> reverseList(LinkedList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        return list;
    }

    public static String getUpdatedString(String str) {
        String[] arr = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for (String ele : arr) {
            sb.append(Character.toUpperCase(ele.charAt(0)));
            sb.append(ele.substring(1));
            sb.append(" ");
        }
        return new String(sb);
    }

    public static String palindrome(String str) {
        String ans = "";
        int max = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            String sub = "";
            for (int j = i; j < arr.length; j++) {
                sub = str.substring(i, j + 1);
                if (rev(sub)) {
                    if (max < sub.length()) {
                        max = sub.length();
                        ans = sub;
                    }
                }
            }
        }
        return ans;
    }

    public static boolean rev(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkMail(String s) {
        Pattern p = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z.]+$");
        Matcher m = p.matcher(s);
        boolean check = m.matches();
        return check;
    }

    public static boolean checkMobile(String mob) {
        Pattern p = Pattern.compile("\\d{10}");
        Matcher m = p.matcher(mob);
        boolean check = m.matches();
        return check;
    }

    public static void extractText(String s) {
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    public static boolean onlyDigit(String s) {
        Pattern p = Pattern.compile("^[A-Za-z]+");
        Matcher m = p.matcher(s);
        boolean check = m.matches();
        return check;
    }

    public static void extractNum(String s) {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    public static boolean validateMail(String s) {
        Pattern p = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z+.]+$");
        Matcher m = p.matcher(s);
        boolean check = m.matches();
        return check;
    }

    public static String palind(String str) {
        int max = 0;
        char[] arr = str.toCharArray();
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            String sub = "";
            for (int j = i; j < arr.length; j++) {
                sub = str.substring(i, j + 1);
                if (reverse(sub)) {
                    if (max < sub.length()) {
                        max = sub.length();
                        ans = sub;
                    }
                }
            }
        }
        return ans;
    }

    public static boolean reverse(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<String> mostFreqEle(String str, int k) {
        String temp = str.replaceAll("^[A-Za-z]", "");
        String[] arr = temp.split(" ");
        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String ele : arr) {
            arrayList.add(ele);
        }
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], Collections.frequency(arrayList, arr[i]));
        }
        System.out.println(map);
        ArrayList<String> ans = new ArrayList<>();
        int max = 0;
        int secMax = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                secMax = max;
                max = entry.getValue();
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        extractText("Hello regex 123 !@");
        System.out.println(checkMobile("976697962"));
        System.out.println(palindrome("hellomadamhe"));
        System.out.println("---------------");
        System.out.println(onlyDigit("shffhkfhkshfkhfhf32"));
        extractNum("12java regex3 2hi5");
        System.out.println(validateMail("moren9817@gmail.com"));
        System.out.println(palind("hellomadamhe"));
        System.out.println(mostFreqEle("java is lang java is not pyhton java is not oop java is fast", 2));
//        System.out.println(getUpdatedString("hello nikhil more"));
//        int[] arr = {1,8,6,2,5,4,8,3,7};
//        System.out.println(Arrays.toString(getRotateLeft(arr,3)));
//
//        LinkedList<Integer>list = new LinkedList<>();
//        list.add(10);

//        list.add(20);
//        list.add(30);
//        System.out.println(removeEvenIndex(list));
    }
}
