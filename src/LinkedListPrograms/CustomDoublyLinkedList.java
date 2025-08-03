package LinkedListPrograms;

public class CustomDoublyLinkedList<T> {
    private Node head;
    private Node tail;
    private class Node{
        private Node prev;
        private Node next;
        private T val;

        public Node(T val){
            this.val = val;
        }
        public Node(T val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }

    public void addFirst(T val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head!=null){
            head.prev = node;
        }
        head = node;
    }
    public void Display(){
        Node temp = head;
        Node last=null;
        while (temp!=null){
            System.out.print(temp.val+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("Null");
//        revDisp(last);
    }
//    public void revDisp(Node last){
//        System.out.print("Null");
//        while (last!=null){
//            System.out.print(" <- "+last.val);
//            last = last.prev;
//        }
//    }
    public void addLast(T val){
        Node node = new Node(val);
        Node last = null;
        Node temp = head;
        while (temp!=null){
            last = temp;
            temp = temp.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
    }
    public void addMid(int ind,T val){
        Node node = new Node(val);
        Node temp = getPrev(ind);
        node.next = temp.next;
        temp.next.prev = node;
        node.prev = temp;
        temp.next = node;
    }
    public Node getPrev(int ind){
        Node temp = head;
        for (int i = 1;i<ind;i++){
            temp = temp.next;
        }
        return temp;
    }

}
