package EPAM.coding.Stacks;

import java.util.Stack;

public class RemoveDup {
    public static void main(String[] args) {
        String s = "abbaca";
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }else {
                stack.push(ch);
            }

        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
