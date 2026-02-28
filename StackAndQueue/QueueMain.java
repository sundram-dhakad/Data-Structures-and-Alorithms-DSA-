package StackAndQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue q = new CustomQueue(5);
//
//        q.insert(10);
//        q.insert(20);
//        q.insert(30);
//        q.insert(40);
//        q.insert(50);
//       // q.insert(60);
//        q.display();
//
//        System.out.println("Removed : "+q.remove());
//        System.out.println("Removed : "+q.remove());
//        q.display();

//        CircularQueue cq = new CircularQueue(5);
//        cq.insert(10);
//        cq.insert(20);
//        cq.insert(30);
//        cq.insert(40);
//        cq.insert(50);
//        cq.display();
//
//        System.out.println(cq.remove());
//        cq.display();
//
//        cq.insert(60);
//        cq.display();

        DynamicQueue dq =new DynamicQueue(5);
        dq.insert(10);
        dq.insert(20);
        dq.insert(30);
        dq.insert(40);
        dq.insert(50);
        dq.insert(60); //inserting element beyond the size
        dq.display();
    }
}
