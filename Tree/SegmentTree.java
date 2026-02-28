package Tree;

public class SegmentTree {

    private class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int data,int startInterval, int endInterval){
            this.data = data;
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    private Node root;

    public SegmentTree(int[] arr){
        root = constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end){
            return new Node(arr[start],start,end);
        }

        int mid = start+(end-start)/2;
        Node leftNode = constructTree(arr,start,mid);
        Node rightNode = constructTree(arr,mid+1,end);

        Node node = new Node(leftNode.data+rightNode.data,start,end);
        node.left = leftNode;
        node.right = rightNode;

        return node;
    }

    public void display(){
        display(root);
    }

    private void display(Node node){
        if (node == null){
            return;
        }

        System.out.println("\nNode Info : ");
        System.out.println("Sum : "+node.data);
        System.out.println("Range : ["+node.startInterval+","+node.endInterval+"]");
        display(node.left);
        display(node.right);
    }

    //Query
    public int query(int qsi, int qei){
        return query(this.root,qsi,qei);
    }

    private int query(Node node, int qsi, int qei) {
        if (node.startInterval>=qsi && node.endInterval<=qei ){
            //node range completely lying in query range
            return node.data;
        }
        else if (node.startInterval>qei || node.endInterval<qsi){
            //node range is completely outside of query range
            return 0;
        }
        else {
            return query(node.left,qsi,qei) + query(node.right,qsi,qei);
        }
    }

    //Update
    public void update(int index, int value){
        root.data = update(root,index,value);
    }

    private int update(Node node, int index, int value) {
        if (index == node.startInterval && index == node.endInterval){
            node.data = value;
            return node.data;
        }

        if(index >= node.startInterval && index <= node.endInterval){
            int leftAns = update(node.left,index,value);
            int rightAns = update(node.right,index,value);
            node.data = leftAns+rightAns;
        }

        return node.data;
    }
}
