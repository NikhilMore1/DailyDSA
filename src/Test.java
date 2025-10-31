import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
class MyException extends RuntimeException{
    MyException(String s){
        super(s);
    }
}
public class Test {
    protected int[] data;
    private static final int size = 10;
    Test(int size){
        data = new int[size];
    }
    Test(){
        this(size);
    }
    int len = 0;
    private int top = -1;
    public void push(int ele){
        if (top>=data.length){
            resize();
        }
        top++;
        data[top] = ele;
    }
    public void resize(){
        int[] temp = new int[data.length*2];
        for (int i = 0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public int pop(){
        if (top == -1){
            throw new MyException("NoSuchElementException");
        }
        int remove = data[top];
        top--;
        return remove;
    }

    @Override
    public String toString(){
        String datas = "[ ";
        for (int i = 0;i<top;i++){
            datas = datas+data[i]+" ,";
        }
        datas = datas+data[top];
        return datas+" ]";
    }
    public int peek(){
        if (top == -1){
            throw new MyException("NoSuchElementException");
        }
        return data[top];
    }
    public boolean isEmpty(){
        if (top == -1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
//        Deque<Integer> stack = new ArrayDeque<>();
//        System.out.println(stack.pop());

        Test test = new Test();
        test.push(10);
        test.push(20);
        test.push(30);
        test.push(40);
        System.out.println(test);
        System.out.println(test.pop());
        System.out.println(test);
    }
}