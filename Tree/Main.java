package Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        Scanner scanner = new Scanner(System.in);
//        tree.insert(scanner);
//        tree.display();
//
//        tree.preOrder();
//        tree.inOrder();
//        tree.postOrder();

          BST bst = new BST();
          int [] arr = {10,5,15,20,16,30,8,55,2,1};
          bst.insertArray(arr);

          bst.display();
          bst.convert(); //convert into doubly linked list
//          System.out.println("\nHeight of tree : "+bst.treeHeight());
//          //bst.displayInfo();
//
//        System.out.println("\nAVL TREE : ");
//        AVL tree = new AVL();
//        for (int i = 0; i < 10; i++) {
//            tree.insert(i);
//        }
//        tree.display();
//        System.out.println("\nHeight of tree : "+tree.height());
//        //tree.displayInfo();
    }
}
