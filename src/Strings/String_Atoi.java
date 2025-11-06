package Strings;

public class String_Atoi {
    public static String getInt(String s){
        String str = s.replaceAll(" ","");
        Integer a = 0;
        StringBuffer sb = new StringBuffer();
        int i = 0;
        if (str.charAt(0) == '-'){
            sb.append("-");
            i=1;
        }
        if (str.charAt(i) == '0'){
            while (i<str.length()){
                if (str.charAt(i)=='0'){
                    i++;
                }else {
                    break;
                }
            }
        }
        while (i<str.length()) {
            if (Character.isDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
                i++;
            }else {
                break;
            }
        }
        if (sb.isEmpty()){
            sb.append("0");
        }
        int ab = new Integer(String.valueOf(sb));
        System.out.println(ab);
        return new String(sb);
    }

    public static void main(String[] args) {
        System.out.println(getInt(" -001223keme33"));
    }
}
