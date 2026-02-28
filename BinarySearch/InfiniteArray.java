package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        //we may face IndexOutOfBound Error because we are only assuming the array is infinite
        int[]arr = {2,3,5,7,8,10,11,12,15,20,23,30};
        int target = 15;

        int ans = ans(arr,target);
        System.out.println(ans);

    }
    static int ans(int[]arr,int target){
        int start = 0;
        int end = 1;

        while (target>arr[end]){
            int newStart = end+1;
            end = end + (end-start+1) * 2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[]arr,int target,int start, int end){

        while (start<=end){
            int mid = start + (end-start)/2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
