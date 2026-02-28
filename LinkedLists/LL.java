package LinkedLists;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //insert at a particular index
    public void insert(int val, int index){
        if (index == 0){
            insertFirst(val);
        }
        if (index == size){
            insertLast(val);
        }

        Node temp = head;
        for (int i = 1; i<index; i++){
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
    }

    //Insert through recursion
    public void insertRecursion(int val, int index){
        if (index == 0){
            Node n = new Node(val);
            n.next = head;
            head = n;
            size++;
            return;
        }
        insertRec(val,index,head);
    }
    private void insertRec(int val, int index, Node prev){
        if (index == 1){
            Node n = new Node(val);
            n.next = prev.next;
            prev.next = n;
            size++;
            return;
        }
        insertRec(val,index-1,prev.next);
    }

    public void deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        System.out.println("\nDeleted : "+val);
    }

    public void deleteLast(){
        if (size<=1){
            deleteFirst();
        }

        Node secondLast = getNode(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;

        System.out.println("\nDeleted : "+val);
    }

    public void delete(int index){
        if (index == 0){
            deleteFirst();
            return;
        }
        if (index == size-1){
            deleteLast();
            return;
        }
        Node prev = getNode(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        System.out.println("\nDeleted : "+val);
    }

    //Return node at particular index
    public Node getNode(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //Return node of a particular value
    public Node findNode(int val){
        Node temp = head;
        while (temp!=null){
            if (temp.value == val ){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    //Recursion reverse
    public void reverse(Node node){
        if(node == tail){
            head = node;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }


}
