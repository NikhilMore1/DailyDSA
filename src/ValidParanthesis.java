import java.util.Stack;
public class ValidParanthesis {
    public boolean myFun(String str){
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()){
            if(ch == '('){
                stack.push(')');
            } else if (ch == '[') {
                stack.push(']');
            }else if(ch == '{'){
                stack.push('}');
            }else {
                if (stack.isEmpty()||stack.pop()!=ch){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
       ValidParanthesis obj = new ValidParanthesis();
       String str = "()[]{}";
        System.out.println(obj.myFun(str));
    }
}
