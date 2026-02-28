package LinkedLists;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.prev = null;
        node.next = head;
        if(head != null){
            head.prev = node;
        }
        head = node;
        if (tail == null){ tail = head; }
        size++;
    }

    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        node.next = null;
        node.prev = tail;
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }

        Node pn = getNode(index-1);
        Node node = new Node(val);
        node.prev = pn;
        node.next = pn.next;
        pn.next = node;
        node.next.prev = node;
        size++;
    }

    public Node getNode(int index){
        Node temp = head;
        for (int i = 1; i<=index; i++){
           temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse(){
        Node temp = tail;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

}
