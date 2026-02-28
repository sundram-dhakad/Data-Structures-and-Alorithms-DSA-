package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        //Array sorted in ascending order
        int[] arr = {-10,-5,0,2,4,8,10,15,20,25,30,35};
        int target = 15;

        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }
    static int binarySearch(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if (target>arr[mid]){
                start = mid+1;
            }
            else if (target<arr[mid]) {
                end = mid-1;
            }
            else {
                return mid;  //ans found
            }
        }
        return -1;
    }
}
