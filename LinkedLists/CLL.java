package LinkedLists;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL(){
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int val){
            this.value = val;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }else{
            tail.next = head;
        }
        size++;
    }

    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        node.next = head;
        tail.next = node;
        tail = node;
        size++;
    }

    public void deleteFirst(){
        if (head == null){
            return;
        }
        int val = head.value;
        head = head.next;
        tail.next = head;
        size--;
        System.out.println("Deleted : "+val);
    }

    public void deleteLast(){
        if (tail == null){
            return;
        }
        Node temp = head;
        while (temp.next!=tail){
            temp = temp.next;
        }
        int val = tail.value;
        temp.next = head;
        tail = temp;
        size--;
        System.out.println("Deleted : "+val);
    }

    public void display(){
        Node temp = head;
        if (head == null){
            System.out.println("list is empty ! ");
            return;
        }
        do {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }while (temp!=head);
        System.out.println(temp.value+"(HEAD)");
    }
}
