package MathsPractice;

public class OddEven {
    public static void main(String[] args) {
        int n = 56;
        System.out.println(isOdd(n));
    }
    //Function to check if a number is odd or not
    private static boolean isOdd(int n) {
        if((n & 1) == 1){
            return true;
        }
        return false;
    }
}
