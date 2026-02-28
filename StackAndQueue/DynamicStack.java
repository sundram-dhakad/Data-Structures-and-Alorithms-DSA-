package StackAndQueue;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();  //this will call CustomStack()
    }

    public DynamicStack(int size){
        super(size); //this will call CustomStack(int size)
    }

    //If Stack is full
    @Override
    public void push(int value) throws StackException {
        if(this.isFull()){
            //Double the size
            int[] temp = new int[data.length *2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }
        //we doubled the size now we can simply call our original push function to insert
        super.push(value);
    }
}
