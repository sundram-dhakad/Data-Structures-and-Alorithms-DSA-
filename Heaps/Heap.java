package Heaps;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap(){
        list = new ArrayList<>();
    }

    //swap function
    private void swap(int first , int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    //get parent : considering index starting from 0
    private int parent(int index){
        return (index-1)/2;
    }

    //get left
    private int left(int index){
        return index * 2 + 1;
    }

    //get right
    private int right(int index){
        return index * 2 + 2;
    }

    public int size(){
        return list.size();
    }

    //insert
    public void insert(T value){
        list.add(value);
        upheap(list.size()-1);
    }
    //To maintain that the smallest element should be at the top
    //all the children should be greater than the parent
    private void upheap(int index){
        if (index == 0){
            return;
        }
        int p = parent(index);
        if (list.get(index).compareTo(list.get(p)) < 0){  //compareTo() returns -1 for lesser , 0 for equal & 1 for greater
            swap(index,p);
            upheap(p);
        }
    }

    //Remove
    //will return the lowest element which is at the top of the tree
    public T remove() throws Exception{
        if (list.isEmpty()){
            throw new Exception("Removing from an empty heap !!");
        }

        T temp = list.getFirst();

        T last = list.removeLast();

        if (!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }

        return temp;
    }
    //To again maintain that the smallest element remain at the top
    private void downheap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(min).compareTo(list.get(left))>0){
            min = left;
        }
        if (right < list.size() && list.get(min).compareTo(list.get(right))>0){
            min = right;
        }

        if (min != index){
            swap(index,min);
            downheap(min);
        }
    }

    //HeapSort
    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }
}
