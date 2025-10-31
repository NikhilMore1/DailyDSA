package Amazon.Arrays;

public class CountAndSay {
    public static void get(int n) {
        String result = "1";

        for (int i = 1; i < n; i++) {
            result = dec(result);
            System.out.println(result);
        }
    }
    public static String dec(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 1;i<s.length();i++){
            if (s.charAt(i) == s.charAt(i-1)){
                count++;
            }else {
                sb.append(count).append(s.charAt(i-1));
                count = 1;
            }
        }
        sb.append(count).append(s.charAt(s.length()-1));
        return sb.toString();
    }
    private static String describe(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }
        sb.append(count).append(s.charAt(s.length() - 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        get(5);
    }
}
