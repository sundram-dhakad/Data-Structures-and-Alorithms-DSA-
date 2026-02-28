package StackAndQueue;

public class CircularQueue {
    protected int[]data;
    private static final int DefaultSize = 10;

    protected int end = 0;
    protected int front = 0;
    int size = 0;

    public CircularQueue(){
        this(DefaultSize);
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public void insert(int value) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full !!");
        }
        data[end++] = value;
        end = end% data.length;
        size++;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }

        int removed = data[front++];
        front = front% data.length;
        size--;
        return removed;
    }

    protected boolean isFull() {
        return size == data.length;
    }

    private boolean isEmpty(){
        return size == 0;
    }

    public void display(){
        if (size == 0){
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        do{
            System.out.print(data[i] + " -> ");
            i++;
            i = i% data.length;
        }while (i!=end);

        System.out.println("END");
    }

}
