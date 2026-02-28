package StackAndQueue;

import java.util.Arrays;

public class CustomStack {
    protected int[]data;
    private static final int DefaultSize = 10;

    private int top = -1;

    public CustomStack(){
        this(DefaultSize);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public void push(int value) throws StackException{
        if(isFull()){
            throw new  StackException("Stack is Full !!");
        }
        top++;
        data[top] = value;
    }

    public int pop() throws StackException{
        if (isEmpty()){
            throw new StackException("No Element to Delete !!");
        }
        return data[top--];
    }

    public int peek() throws StackException{
        if (isEmpty()){
            throw new StackException("Stack is Empty !!");
        }
        return data[top];
    }

    protected boolean isFull() {
        return top == data.length-1;
    }

    private boolean isEmpty(){
        return top == -1;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Stack is Empty !!");
            return;
        }
        System.out.println("Stack : "+Arrays.toString(Arrays.copyOfRange(data,0,top+1)));
    }
}
