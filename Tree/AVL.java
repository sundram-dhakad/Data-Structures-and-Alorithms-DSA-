package Tree;

public class AVL {
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

    public int height() {
        return height(root);
    }
    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            // left heavy
            if(height(node.left.left) - height(node.left.right) > 0) {
                // left-left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0) {
                // left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (height(node.left) - height(node.right) < -1) {
            // right heavy
            if(height(node.right.left) - height(node.right.right) < 0) {
                // right - right case
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0) {
                // left right case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left), height(c.right))+1;

        return c;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        c.height = Math.max(height(c.left), height(c.right))+1;
        p.height = Math.max(height(p.left), height(p.right))+1;
        return p;
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
}
