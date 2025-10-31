package collection_Framework.BinaryTrees;

public class CustomBT {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    Node root = null;
    static int ind = -1;
    public Node add(int[] arr){
        ind ++;
        if ( ind>=arr.length || arr[ind]<0){
            return null;
        }
        Node node = new Node(arr[ind]);
        node.left = add(arr);
        node.right = add(arr);
        return node;
    }
    public void inorder(Node root){
        if (root == null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public void preorder(Node root){
        if (root == null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(Node root){
        if (root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,-1,-1,3,4,-1,-1};
        CustomBT bt = new CustomBT();
        bt.root = bt.add(arr);
        bt.postorder(bt.root);
    }
}
