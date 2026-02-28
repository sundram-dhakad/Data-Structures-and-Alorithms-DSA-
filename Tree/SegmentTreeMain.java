package Tree;

public class SegmentTreeMain {
    public static void main(String[] args) {
        int[]arr = {3,8,7,6,-2,-8,4,9};
        SegmentTree st = new SegmentTree(arr);
        st.display();
        System.out.println("\nSum of elements between given range : "+st.query(2,6));

        System.out.println("\nAfter Updating : ");
        st.update(3,10);
        st.display();
        System.out.println("\nSum of elements between given range : "+st.query(2,6));
    }
}
