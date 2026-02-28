package BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[]arr = {0,1,5,15,250,90,80,70,40,10};
        int target = 90;

        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[]arr,int target){
        int peak = peakIndex(arr);

        int firstTry = orderAgnosticBinarySearch(arr,target,0,peak);
        if (firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
    }

    static int orderAgnosticBinarySearch(int[]arr, int target, int start, int end) {

        while (start<=end){
            int mid = start + (end-start)/2;

            if (target == arr[mid]){
                return mid;
            }

            //if array is sorted in ascending order
            if (arr[start] < arr[end]){
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

    static int peakIndex(int[]arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int mid = start + (end-start)/2;

            if (arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }

}
