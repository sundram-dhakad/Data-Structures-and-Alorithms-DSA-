package Tree;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){

    }

    //Creating Node
    private class Node{
        int value;
        Node left;     //for left hand side node
        Node right;   //for right hand side node

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    //Insert Elements
    //First insert root node
    public void insert(Scanner scanner){
        System.out.println("Enter the root node : ");
        int value = scanner.nextInt();
        root = new Node(value);
        insert(scanner,root);
    }
    //Inserting other nodes
    private void insert(Scanner scanner, Node node) {
        //to insert node in left
        System.out.println("Do you want to enter left of "+node.value);
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Enter the value of the left of "+node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            insert(scanner,node.left);
        }

        //to insert node in right
        System.out.println("Do you want to enter right of "+node.value);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("Enter the value of the right of "+node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            insert(scanner,node.right);
        }
    }

    //Display Tree
    public void display(){
        System.out.println("\nTree : ");
        display(root,0);
    }

    private void display(Node node, int level) {
        if(node == null){
            return;
        }

        //first Go till the rightMost Element you can go
        display(node.right, level+1);

        if(level != 0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.value);
        }else {
            System.out.println(node.value);
        }

        display(node.left,level+1);
    }

    //Pre Order Traversal
    public void preOrder(){
        System.out.println("\nPre-Order : ");
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null){
            return;
        }
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    //In Order Traversal
    public void inOrder(){
        System.out.println("\nIn-Order : ");
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    //Post Order Traversal
    public void postOrder(){
        System.out.println("\nPost-Order : ");
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }

}
