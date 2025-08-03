package LinkedListPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDupSingly {
    private Node head;
    private Node tail;
    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
        public Node(ArrayList<Integer> arr){
            for (int i = 0;i<arr.size();i++){
                System.out.print(arr.get(i)+" -> ");
            }
            System.out.println("Null");
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
            System.out.print(temp.val+ " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public Node remove(){
        Node temp = head;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (temp!=null){
            if (!(arrayList.contains(temp.val))){
                arrayList.add(temp.val);
            }
            temp = temp.next;
        }
        return new Node(arrayList);
    }
    public static void main(String[] args) {
        RemoveDupSingly list = new RemoveDupSingly();
        list.add(10);
        list.add(20);
        list.add(104);
        list.add(104);
        list.add(40);
        list.remove();
    }
}
