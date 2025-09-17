package collection_Framework.BinaryTrees;

import java.util.Scanner;

public class BinaryTree {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    BinaryTree(){

    }
    private Node root;
    public void populate(Scanner scanner){
        System.out.println("Enter the root node value");
        int val = scanner.nextInt();
        Node node = new Node(val);
        populate(scanner,node);
    }
    public void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter left of "+ node.data);
        boolean bool = scanner.nextBoolean();
        if (bool){
            System.out.println("Enter the value to left of "+node.data);
            int value = scanner.nextInt();
            node.left = new Node(value);
            root = node;
            populate(scanner,node.left);
        }
        System.out.println("Do you want to enter at right" +node.data);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("Enter the value to right of "+node.data);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }
    }
    private void display(){
        display(root, "");
    }
    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }

        // Print current node
        System.out.println(indent + node.data);

        // Recurse left and right
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.populate(scanner);
        binaryTree.display();
    }
}
