package collection_Framework.BinaryTrees;
public class BinaryTreees<E> {
    static class Node<E>{
        E data;
        Node<E> left;
        Node<E> right;
        Node(E data){
            this.data = data;
        }
    }
    Node<E> root;
    public void preOrder(Node<E> node){
        if (node == null){
            return;
        }
        System.out.print(node.data+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(Node<E> node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    public void postOrder(Node<E> node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
    public static void main(String[] args) {
        BinaryTreees<Character> tree = new BinaryTreees<>();
        tree.root = new Node<Character>('A');
        tree.root.left = new Node<Character>('B');
        tree.root.right = new Node<Character>('C');
        tree.root.left.left = new Node<Character>('D');
        tree.root.left.right = new Node<Character>('E');
        tree.root.right.left = new Node<Character>('F');
        tree.root.right.right = new Node<Character>('G');
        tree.root.left.left.left = new Node<Character>('H');
        tree.root.left.right.left = new Node<Character>('I');
        System.out.print("PreOrder --> ");
        tree.preOrder(tree.root);
        System.out.println("\n -----------------------------");
        System.out.print("PostOrder --> ");
        tree.postOrder(tree.root);
        System.out.println("\n -----------------------------");
        System.out.print("InOrder --> ");
        tree.inOrder(tree.root);
    }
}