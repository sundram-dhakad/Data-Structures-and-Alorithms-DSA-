package StackAndQueue;

public class StackMain {
    public static void main(String[] args) throws StackException {
        //CustomStack st = new CustomStack(5);
        CustomStack st = new DynamicStack(5);

        //Insertion (PUSH OPERATION)
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.display();

          //DELETION (POP OPERATION)
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        st.display();


    }
}
