package collection_Framework.LinkedList;

import java.util.ArrayList;

public class Revision<E> {
    private Node head;
    private  Node tail;
    private class Node{
        E data;
        Node next;
        Node(E data){
            this.data = data;
        }
    }
    private  int size = 0;
    public int size(){
        return size;
    }
    public boolean add(E data){
        Node node = new Node(data);
        boolean flag = false;
        if(size == 0){
            head = node;
            tail = node;
            size++;
            flag = true;
        }else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            tail = node;
            size++;
            flag = true;
        }
        return flag;
    }
    public void add(int ind,E data){
        Node node = new Node(data);
        Node a = head;
        Node temp = go(ind-1,0,a);
        node.next = temp.next;
        temp.next = node;
    }
    public Node go(int ind,int i, Node temp){
        if(ind == i){
            return temp;
        }
        return go(ind,++i,temp = temp.next);
    }

    public ArrayList<E> removeDup(){
        ArrayList<E> arr = new ArrayList<>();
        Node temp =head;
        while (temp!=null){
            if (!arr.contains(temp.data)){
                arr.add(temp.data);
                temp = temp.next;
            }else {
                temp = temp.next.next;
            }
        }
        return arr;
    }
    @Override
    public String toString(){
        String data = "[ ";
        Node temp = head;
        while (temp.next != null){
            data = data + temp.data+" ,";
            temp = temp.next;
        }
        data = data+temp.data;
        return data+" ]";
    }

    public static void main(String[] args) {
        Revision<Integer> revision = new Revision<>();
        revision.add(10);
        revision.add(20);
        revision.add(30);
        revision.add(20);
        revision.add(30);
        revision.add(2,100);
        System.out.println(revision);
        System.out.println(revision.removeDup());
    }
}
