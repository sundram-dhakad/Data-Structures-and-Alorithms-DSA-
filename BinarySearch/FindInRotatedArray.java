package BinarySearch;

public class FindInRotatedArray {
    public static void main(String[] args) {
        //This is a rotated array, means it started from 0 , then it rotated 5 times.
        // in such a way end came at start in each rotation
      int[]arr = {3,4,5,6,7,0,1,2};
      int target = 6;

      System.out.println(find(arr,target));

    }
    static int find(int[]arr, int target){
        int pivot = findPivot(arr);
        if (arr[pivot]==target){
            return pivot;
        }
        if (target<arr[0]){
            return binarySearch(arr,target,pivot+1,arr.length-1);
        }
        if (target>arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return -1;
    }

    static int binarySearch(int[]arr,int target,int start, int end){
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

    //To find the index from where the array is rotated
    static int findPivot(int[]arr){
      int start = 0;
      int end = arr.length-1;

      while (start<=end){
          int mid = start + (end-start)/2;

          if (mid<end && arr[mid]>arr[mid+1]){
              return mid;
          }
          if (mid>start && arr[mid]<arr[mid-1]){
              return mid-1;
          }
          if (arr[mid]<arr[0]) {
              end = mid-1;
          }
          if (arr[mid]>arr[0]){
              start = mid+1;
          }
      }
      return -1;
    }

    //To find the pivot in the Rotated Array with duplicate elements
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
