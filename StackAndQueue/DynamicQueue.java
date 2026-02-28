package StackAndQueue;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public void insert(int value) throws Exception{
        if(isFull()){
            //Create a double size array
           int[] temp = new int[data.length*2];

           //copy all the previous items
            for (int i = 0; i < data.length; i++) {
               temp[i] = data[(front + i % data.length)];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        //now we have Increased the size so just call the original insert function to perform insertion
        super.insert(value);
    }
}
