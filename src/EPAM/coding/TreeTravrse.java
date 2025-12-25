package EPAM.coding;

public class TreeTravrse {
    private Node root;
    class Node{
       int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public Node insert(Node root ,int data){
        if (root == null){
            return new Node(data);
        }
        if (data<root.data){
            root.left = insert(root.left,data);
        }else {
            root.right = insert(root.right,data);
        }
        return root;
    }
    public void preOrder(Node root){
        if (root == null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public void postOrder(Node root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    public int height(Node root){
        if (root == null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }


}
