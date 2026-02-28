package Recursion;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,10,50,69,78,90,95};
        int target = 78;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    //Binary Search Using Recursion
    static int search(int[] arr, int target, int start, int end){
        if (start>end){
            return -1;
        }

        int mid = (start+end)/2;

        if (target == arr[mid]){
            return mid;
        }

        if (target<arr[mid]){
            return search(arr,target,start,mid-1);
        }

        return search(arr,target,mid+1,end);
    }
}
