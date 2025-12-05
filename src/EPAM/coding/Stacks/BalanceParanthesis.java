package EPAM.coding.Stacks;

import java.util.HashMap;
import java.util.Stack;

public class BalanceParanthesis {
    public static boolean check(String s){
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            if (map.containsKey(ch)){
                if (stack.isEmpty() || stack.pop() != map.get(ch)){
                    return false;
                }
            }else
            {
                stack.push(ch);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "([)]";
        String s3 = "{[]}";

        System.out.println(s1 + " is valid: " + check(s1)); // Output: true
        System.out.println(s2 + " is valid: " + check(s2)); // Output: false
    }
}
