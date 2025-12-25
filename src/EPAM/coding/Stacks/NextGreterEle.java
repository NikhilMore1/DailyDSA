package EPAM.coding.Stacks;

import java.util.*;

public class NextGreterEle {
    public static void main(String[] args) {
        HashMap<Character,Character>map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        String ch = "()[](())";
        boolean flag;
        for (char c : ch.toCharArray()){
            if (map.containsKey(c)){
                if (stack.isEmpty() || stack.pop() != map.get(c)){
                    flag = false;
                    System.out.println(flag);
                }
            }else {
                stack.push(c);
            }
        }
        flag = true;
        System.out.println(flag);

    }
}
