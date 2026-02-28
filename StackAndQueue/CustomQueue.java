package StackAndQueue;

public class CustomQueue {
    protected int[]data;
    private static final int DefaultSize = 10;

    private int end = 0;

    public CustomQueue(){
        this(DefaultSize);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public void insert(int value) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full !!");
        }
        data[end++] = value;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }

        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;

        return removed;
    }

    protected boolean isFull() {
        return end == data.length;
    }

    private boolean isEmpty(){
        return end == 0;
    }

    public void display(){
        if (end == 0){
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

}
