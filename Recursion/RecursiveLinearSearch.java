package Recursion;

import java.util.ArrayList;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        int[] arr ={7,10,9,5,8,1,20,20,50};
        //System.out.println(RLS(arr,20,0));
        //System.out.println(RLS2(arr,20,0));

        //ArrayList<Integer> ans = allIndexes(arr,20,0,new ArrayList<>());
        //System.out.println(ans);

        System.out.println(allIndexes2(arr,20,0));
    }

    //first way : Returning Boolean value
    static boolean RLS(int[] arr, int target , int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || RLS(arr,target,index+1);
    }

    //Second way : returning index
    static int RLS2(int[] arr, int target , int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else{
           return RLS2(arr,target,index+1);
        }
    }

    //Returning all indexes of the target element
    static ArrayList<Integer> allIndexes(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return allIndexes(arr,target,index+1,list);
    }

    //Returning all index without taking ArrayList as argument
    static ArrayList<Integer> allIndexes2(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = allIndexes2(arr,target,index+1);

        list.addAll(ansFromBelowCalls);

        return list;
    }

}
