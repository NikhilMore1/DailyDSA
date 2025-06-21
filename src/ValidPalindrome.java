public class ValidPalindrome {
    public boolean myFun(String str){
        String merge = str.replaceAll("[^a-zA-Z]","").toLowerCase();
        int left = 0;
        int right = merge.length()-1;
        while (left<right){
            if (merge.charAt(left) != merge.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
    ValidPalindrome obj = new ValidPalindrome();
    String str = "non oo Non";
        System.out.println(obj.myFun(str));
    }
}
