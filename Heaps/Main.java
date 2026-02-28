package Heaps;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
//        Heap<Integer> heap = new Heap<>();
//        heap.insert(30);
//        heap.insert(10);
//        heap.insert(35);
//        heap.insert(90);
//        heap.insert(75);
//
////        System.out.println(heap.remove());
////        System.out.println(heap.remove());
//        ArrayList<Integer> sorted = heap.heapSort();
//        System.out.println(sorted);


        int [] arr = {3,33,7,2,10,5,20,1,99,0,12};
        HeapSort h = new HeapSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
