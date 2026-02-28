package Tree;

public class BST {
    public BST(){

    }

    private class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }

        int getValue(){
            return value;
        }

        int getHeight(){
            return height;
        }
    }

    private Node root;

    public int treeHeight(){
        if (root == null){
            return -1;
        }
        return height(root);
    }

    private int height(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insertArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }

    public void insert(int value){
        if (root == null){
            root = new Node(value);
        }else {
            insert(root, value);
        }
    }

    private void insert(Node node, int value) {
        if (value == node.getValue()){
            return;
        }

        if (value< node.getValue()){
            if (node.left != null){
                insert(node.left, value);
            }else {
                node.left = new Node(value);
            }
        }else {
            if(node.right != null){
                insert(node.right,value);
            }else {
                node.right = new Node(value);
            }
        }

        node.height = Math.max(height(node.left),height(node.right)) +1;
    }

    //Checking whether the Tree is balanced or not
    public boolean isBalanced(Node node){
        if (node == null){
            return true;
        }

        return Math.abs(height(node.left)-height(node.right)) <=1 && isBalanced(node.left) && isBalanced(node.right);
    }

    //Display Tree
    public void display(){
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

    //Display Information
    public void displayInfo(){
        displayInfo(this.root,"Root node");
    }

    private void displayInfo(Node node, String details) {
        if (node == null){
            return;
        }
        System.out.println(details +" : " + node.getValue());
        displayInfo(node.left,"Left child of "+node.getValue());
        displayInfo(node.right,"Right child of "+node.getValue());
    }



    //Convert into doubly Linked list
    public void convert(){
        LLNode temp =  convert(root);
        System.out.print("\nLinked List : ");
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    private LLNode head;
    private LLNode tail;

    private LLNode convert(Node root) {
        if (root == null) {
            return null;
        }

        helper(root);

        return head;
    }

    private void helper(Node node) {
        if(node == null) {
            return;
        }

        helper(node.left);

        LLNode newNode = new LLNode(node.value);

        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        helper(node.right);
    }

    class LLNode {
      int val;
      LLNode prev;
      LLNode next;

      public LLNode (int val) {
        this.val = val;
      }
    }
}
