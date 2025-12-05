package EPAM.coding.LL;

import java.util.*;

class MyException extends RuntimeException{
    MyException(String s){
        super(s);
    }
}
public class CusLL<E> {
    private Node head;
    class Node{
        E data;
        Node next;
        Node(E data){
            this.data = data;
        }
    }
    private static int size = 0;
    public boolean add(E data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            size++;
            return true;
        }
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        size++;
        return true;
    }
    public void addFirst(E data){
        Node node = new Node(data);
        if (head==null){
            head = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;

    }
    public void addLast(E data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }
    public E getFirst(){
        if (head==null){
            throw new MyException("NoSuchElementEx");
        }
        return head.data;
    }
    public E getLast(){
        if (head==null){
            throw new MyException("NoSuchElementEx");
        }
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        return temp.data;
    }
    public E removeFirst(){
        if (head==null){
            throw new MyException("NoSuchElementEx");
        }
        E data = head.data;
        head = head.next;
        size--;
        return data;
    }
    public E removeLast() {
        if (head == null) {
            throw new MyException("NoSuchElementEx");
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        E data = temp.next.data;
        temp.next = null;
        size--;
        return data;
    }

    public String toString(){
        String data = "[ ";
        Node temp = head;
        while (temp.next!=null){
            data = data+temp.data+" ,";
            temp = temp.next;
        }
        data = data+temp.data;
        return data+" ]";
    }
    public CusLL<E> reverse(){
        Node curr=head;
        Node next1 = null;
        Node prev = null;
        while (curr!=null){
            next1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next1;
        }
        head = prev;
        return this;
    }
    public boolean isCycle(){
        //using floyed cycle find algo or slow fast pointers approch
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
    public int getOccurances(int num){
        if (head == null){
            throw new MyException("NoElementException");
        }
        Node temp = head;
        int count = 0;
        while (temp!=null){
            if (temp.data.equals(num)){
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    public boolean isPalindrome(){
        Node next = null;
        Node curr = head;
        Node prev = null;
        CusLL<E> rev = new CusLL<>();
        rev = this;
        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        Node temp = head;
        Node temp1 = rev.head;
        while (temp!=null){
            if (temp.data != temp1.data){
                return false;
            }
            temp1 = temp1.next;
            temp = temp.next;
        }
        System.out.println(rev);
        return true;
    }

    public CusLL<E> removeOcc(int key){
        Node temp = head;
        while (temp.next!=null){
            if (temp.next.data.equals(key)){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return this;
    }

    public CusLL<Integer> add(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Node temp = head;
        while (temp!=null){
            arrayList.add((int) temp.data);
            temp = temp.next;
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
        int left = 0;
        int right = arrayList.size()-1;
        CusLL<Integer>ans = new CusLL<>();
        while (left<right){
            int min = arrayList.get(left);
            int max = arrayList.get(right);
            int med = (min+max)/2;
            ans.add(med);
            left++;
            right--;
        }
        return ans;
    }
    public static void main(String[] args) {
        CusLL<Integer> ll = new CusLL<>();
        ll.add(10);
        ll.add(20);
        ll.add(20);
        ll.add(10);
        System.out.println(ll);
        System.out.println(ll.add());
//        System.out.println(ll.isPalindrome());
//        System.out.println(ll.isPalindrome());
//        System.out.println(ll);
//        System.out.println(ll.reverse());
//        System.out.println(ll.getOccurances(30));
    }
}
