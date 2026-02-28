package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[]arr = {5,20,39,10,50,60,-18,35};
        int target = 10;
        boolean ans = search(arr,1,3,target);
        System.out.println(ans);

    }
    static boolean search(int[]arr,int start,int end,int target){
        if (arr.length == 0 || end>arr.length-1){
            return false;
        }
        for (int i = start; i <= end; i++) {
            if (target == arr[i]){
                return true;
            }
        }
        return false;
    }
}
