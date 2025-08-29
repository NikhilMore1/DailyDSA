package collection_Framework.Stack;

import java.util.Stack;
class StackException extends RuntimeException{
    StackException(String s){
        super(s);
    }
}
public class CustomStack<E> {
    private Object[] data;
    private int top = -1;
    private int DEFAULT_SIZE = 10 ;
    CustomStack(){
        this.data = (E[]) new Object[DEFAULT_SIZE];
    }
    CustomStack(int size){
        this.data =(E[]) new Object[size];
    }

    public E push(E data1){
        if (isFull()){
            resize();
        }
        data[++top] = data1;
        return data1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public synchronized E pop(){
        if (isEmpty()){
            throw new StackException("EmptyStackException stack");
        }
        E data1 = (E) data[top];
        top--;
        return data1;
    }
    public boolean isFull(){
        if (top == data.length-1){
            return true;
        }
        return false;
    }
    public Object[] resize(){
        Object[] newData = (E[])new Object[data.length*2];
        for (int i = 0;i<data.length;i++){
            newData[i] = data[i];
        }
        data = newData;
        return  data;
    }
    public synchronized  E peek(){
        if (isEmpty()){
            throw new StackException("EmptystackException");
        }
        return (E)data[top];
    }
    @Override
    public String toString(){
        if (top == -1){
            return "[]";
        }
        String myData = "[ ";
        for (int i = 0;i<top;i++){
            myData = myData+data[i]+", ";
        }
        myData = myData+data[top];
        return myData+" ]";
    }
    public synchronized int search(E data1){
        if (isEmpty()){
            return -1;
        }
        int idx = 1;
        for (int i = top;i>=0;i--){
            if (data[i] == data1){
                return idx;
            }else {
                idx++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
//        stack1.push(100);
//        stack1.push(200);
//        stack1.push(300);
//        stack1.push(400);
//        stack1.push(500);
        System.out.println(stack1.search(100));
//        System.out.println(stack1.pop());
        CustomStack<Integer> stack = new CustomStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.push(110);
        stack.push(110);
//        System.out.println(stack);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search(110));
    }
}
