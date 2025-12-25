package EPAM.coding.Strings;

public class AdjDup {
    public static void remove(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "aabbac";
        remove(str);
    }
}