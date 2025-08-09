package RegEx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Demo {
    public static void main(String[] args) {
        String regex = "a*b+c{4,9}d?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("aabcccccccccd");
        boolean result = matcher.matches();
        System.out.println(result);
        System.out.println(matcher);
    }
}
