package LinkedListPrograms;

import java.util.Stack;

public class CustomLinkedList <T> {
    private Node head;
    private Node tail;
    private class Node{
        private T data;
        private Node next;

        public Node(T data){
            this.data = data;
        }
        public Node(T data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    private int size;
    CustomLinkedList(){
        this.size = 0;
    }

    public void insertData(T val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size = size+1;
    }

    public void insertLast(T val){
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size = size+1;
    }
    public void reverseList() {
        Node head1= head;
        Stack<T> stack = new Stack<>();
        while (head1!=null){
            stack.push(head1.data);
            head1 = head1.next;
        }
        for (int i = stack.size()-1;i>=0;i--){
            System.out.println(stack.pop());
        }


    }
    public void insertMid(T val,int idx){
        Node node = new Node(val);
        Node temp = getNode(idx);
        node.next = temp.next;
        temp.next = node;
        size = size+1;
        }
        public Node getNode(int idx){
        Node temp = head;
        for (int i = 1;i<idx-1;i++){
            temp = temp.next;
        }
        return temp;
        }
        public void deleteFirst(){
        if (head.next == null){
            head = tail;
        }
        head = head.next;
        }
        public void deleteLast(){
        Node temp = head;
        int count = 1;
        int id = 0;
        while (temp!=null){
            if (temp.next== null){
                id = count-1;
                Node temp1 = getNode1(id);
                temp1.next = null;
                tail = temp1;
            }
            temp = temp.next;
            count++;
        }
            System.out.println(id);
        }
        public void update(T val,int idx){
        Node temp  = getNode2(idx);
        temp.data = val;
        }
        public Node getNode2(int id){
        Node temp = head;
        for (int i = 1;i<id;i++){
            temp = temp.next;
        }
        return temp;
        }
        public Node getNode1(int id){
        Node temp = head;
        for (int i = 1;i<id;i++){
            temp = temp.next;
        }
        return temp;
        }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data +"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void peek(){
        Node temp = head;
        System.out.println(temp.data);
    }
    public int size(){
        int count = 0;
        Node temp = head;
        while (!(temp == null)){
            temp = temp.next;
            count = count+1;
        }
        return count;
    }
}
