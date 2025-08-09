package Generics;

public class CustomGen<T> {
    private class Node{
        private T val;
        private Node next;
        private Node prev;

        public Node(T val){
            this.val = val;
        }
        public Node(T val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    private Node head;

    public void addFirst(T val){
        Node node = new Node(val);
        node.prev = null;
        node.next = head;
        if (head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node temp = head;
        Node last = head;
        while (temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
            last = last.next;
        }
//        reverseDisp(last);
        System.out.println("Null");
    }

    public void reverseDisp(Node last){
        System.out.print("Null");
        while (last!=null){
            System.out.println("<- "+last.val);
            last = last.prev;
        }
    }

    public void addMid(int idx,T val){
        Node node = new Node(val);
        Node temp = getNode(idx);
        node.prev = temp;
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
    }
    public Node getNode(int idx){
        Node temp = head;
        for (int i = 1;i<=idx;i++){
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        CustomGen<Integer> list = new CustomGen<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addMid(2,199);
        list.display();
    }
}
