package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {
    public static void main(String[] args) {
//        String str = "java is lang is Java java jaVA jaVA JAVA";
//        Pattern pattern = Pattern.compile("java",Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher(str);
//        while (matcher.find()){
//            System.out.println(matcher.start() + " "+matcher.end() +" "+matcher.group());
//        }
//        System.out.println(matcher.matches());



        boolean b = Pattern. matches("a{2,4}d?yya+", "aadyyayya");
        System.out.println(b);
    }
}
