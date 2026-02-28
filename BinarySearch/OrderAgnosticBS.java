package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //Array sorted in ascending order
        int[] arrA = {-10,-5,0,2,4,8,10,15,20,25,30,35};

        //Array sorted in Descending order
        int[] arrD = {35,30,25,20,15,10,8,4,2,0,-5,-10};

        int target = 15;

        int ans = orderAgnosticBinarySearch(arrD,target);
        System.out.println("Element found at index : "+ans);

    }
    static int orderAgnosticBinarySearch(int[]arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
                int mid = start + (end-start)/2;

                if (target == arr[mid]){
                    return mid;
                }

                //if array is sorted in ascending order
                if (arr[start]<arr[end]){
                    if (target>arr[mid]){
                        start = mid+1;
                    }
                    else {
                        end = mid-1;
                    }
                }
                //else the array is sorted in descending order
                else {
                    if (target<arr[mid]){
                        start = mid+1;
                    }
                    else {
                        end = mid-1;
                    }
                }
        }
        return -1;
    }
}
