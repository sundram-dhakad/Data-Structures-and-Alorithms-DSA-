package Sorting.CyclicSort;

public class FindMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println(findSmallestMissingPositive(arr));
    }

    static int findSmallestMissingPositive(int[] arr){
        int i = 0;
        while (i< arr.length){
            if(arr[i] != i+1){
                if (arr[i] <1 || arr[i]> arr.length) {
                    i++;
                }
                else {
                    swap(arr,i,arr[i]-1);
                }
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                return j+1;
            }
        }

        return arr.length+1;
    }

    static void swap(int[]arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


