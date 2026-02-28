package BinarySearch;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[]arr = {0,1,5,15,250,90,80,70,40,10};

        int ans = peakIndex(arr);
        System.out.println(ans);
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
