package MathsPractice;

public class NoOfSetBits {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(Integer.toBinaryString(n));

        int ans = 0;
        while (n>0){
            n = n-(n & -n);
            ans++;
        }
        System.out.println(ans);
    }
}
