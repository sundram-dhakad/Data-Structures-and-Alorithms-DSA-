package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        //we have to find out how many even digits value are there in this array for ex : 12 and 1896 are even digits
        int[]arr = {12,345,2,6,1896,};
        System.out.println(evenDigits(arr));

    }
    static int evenDigits(int[]arr){
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int count = 0;

            while (value>0){
                value = value/10;
                count++;
            }
            if (count%2==0){
                ans++;
            }
        }

        return ans;

    }
}
