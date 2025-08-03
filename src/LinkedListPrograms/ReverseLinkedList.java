package LinkedListPrograms;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;
public class ReverseLinkedList {
    private Node head;
    private Node tail;
    private class Node{
        private int val;
        private Node next;
        public Node (int val){
            this.val = val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }
    public void add(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public Node reverse(){
        Node temp = head;
        Node prev = null;
        while (temp!=null){
            Node nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        return prev;
    }
    public boolean check(){
        Node temp = head;
        LinkedList<Integer> list = new LinkedList<>();
        while (temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        int i = 0;
        int j = list.size()-1;
        while (i<j){
            if(!(list.get(i).equals(list.get(j)))){
                return false;
            }else {
                i++;
                j--;
            }
        }
        return true;
    }
}
