package EPAM.coding.Stacks;

import java.util.LinkedList;
class MyException extends RuntimeException{
    MyException(String s){
        super(s);
    }
}
public class Custom<E> {
    private Node head;
    class Node{
        E data;
        Node next;
        Node(E data){
            this.data = data;
        }
    }
    public static int size = 0;
    public void push(E data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }
    public E peek(){
        if(head == null){
            return null;
        }
        return head.data;
    }
    public E pop(){
        if (head == null){
            throw new MyException("NoSuchElementException");
        }
        E data1 = head.data;
        head = head.next;
        return data1;
    }
    public String toString(){
        String data = "[ ";
        Node temp = head;
        while (temp.next != null){
            data = data+temp.data+" ,";
            temp = temp.next;
        }
        data = data+temp.data;
        return data+" ]";
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Custom<Integer> custom = new Custom<>();
        custom.push(10);
        custom.push(20);
        custom.push(30);
        custom.push(40);
        System.out.println(custom);
        System.out.println(custom.pop());
        System.out.println(custom);
        System.out.println(custom.peek());
        System.out.println(custom);
    }
}
