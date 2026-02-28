package LinearSearch;

public class MinimumNum {
    public static void main(String[] args) {
        int[]arr = {5,20,39,10,50,60,-18,35};

        int ans = minNum(arr);
        System.out.println(ans);
    }

    static int minNum(int[]arr){
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }

        return min;
    }
}
