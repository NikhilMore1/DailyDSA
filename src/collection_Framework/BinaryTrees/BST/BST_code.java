package collection_Framework.BinaryTrees.BST;

public class BST_code {
    private  static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    Node root = null;
    public static Node insert(Node root,int val){
        if (root == null){
            root = new Node(val);
            return root;
        }
        if (root.data>val){
            root.left = insert(root.left,val);
        }else {
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static void inoder(Node root){
        if (root == null){
            return;
        }
        inoder(root.left);
        System.out.println(root.data+" ");
        inoder(root.right);
    }
    public static boolean search(Node root,int key){
        if (root == null){
            return false;
        }
        if (root.data > key){
            return search(root.left,key);
        }else if(root.data < key){
            return search(root.right,key);
        }else {
            return true;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{5,6,7,8,3,4,1,2};
        BST_code obj = new BST_code();
        Node root = null;
        for (int i = 0;i<arr.length;i++){
            root = insert(root,arr[i]);
        }
        inoder(root);
        if (search(root,14)){
            System.out.println("found");
        }else {
            System.out.println("not found");
        }
    }
}
