package Recursion;

public class IsArraySorted {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,40,50};
        System.out.println(isSorted(arr,1));
    }
    static boolean isSorted(int[] arr, int i){
        if (i == arr.length){
            return true;
        }
        return arr[i]>=arr[i-1] && isSorted(arr,i+1);
    }
}
