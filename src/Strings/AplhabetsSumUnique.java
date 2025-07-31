package Strings;

public class AplhabetsSumUnique {
    public static void main(String[] args) {
        String str = "";
        for (char i = 'A';i<='Z';i++){
            str = str.concat(i+"");
        }
        System.out.println(getSum(str));
    }
    public static boolean getSum(String str){
        char[] arr = str.toCharArray();
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        int Check =13*('A'+'Z');
        if (sum == Check){
            return true;
        }
        return false;
    }
}
