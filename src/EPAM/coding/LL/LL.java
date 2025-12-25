package EPAM.coding.LL;

public class LL<E> {
    private Node head;
    private Node tail;
    private int size = 0;
    class Node{
        E data;
        Node next;
        Node(E data){
            this.data = data;
        }
    }
    public boolean add(E data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            size++;
            return true;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        size++;
        return true;
    }

    public LL<E> reverse(){
        if (head == null){
            return null;
        }
        Node prev = null;
        Node next = null;
        Node curr = head;
        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return this;
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
    public boolean iscycle(){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LL<Integer> ll = new LL<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        System.out.println(ll);
        System.out.println(ll.iscycle());
    }
}
