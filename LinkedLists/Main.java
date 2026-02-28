package LinkedLists;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertLast(99);
        list.insertLast(100);
        list.insertLast(200);
        list.insert(500,3);
        list.insertRecursion(75,5);
        list.display();

//
//        list.deleteFirst();
//        list.display();
//        list.deleteLast();
//        list.display();
//        list.delete(2);
//        list.display();

//        DLL dlist = new DLL();
//        dlist.insertFirst(10);
//        dlist.insertFirst(20);
//        dlist.insertFirst(30);
//        dlist.insertLast(50);
//        dlist.insert(100,3);
//        dlist.display();
//        dlist.displayReverse();

//        CLL clist = new CLL();
//        clist.insertFirst(10);
//        clist.insertFirst(20);
//        clist.insertFirst(30);
//        clist.insertLast(100);
//        clist.display();
//        clist.deleteFirst();
//        clist.display();
//        clist.deleteLast();
//        clist.display();
    }
}
