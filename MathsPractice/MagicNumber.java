package MathsPractice;

public class MagicNumber {
    public static void main(String[] args) {
        // 1 = 1 => 5^1 = 5
        // 2 = 1 => 5^2 , 0 => 5^1 = 25
        // 3 = 1 => 5^2 , 1 => 5^1 = 30 (25+5)
        // 4 = 1 => 5^3 , 0 => 5^2 , 0 => 5^1 = 125
        // 5 = 1 => 5^3 , 0 => 5^2 , 1 => 5^1 = 130(125+5)    (in binary 5 = 1 0 1)
        // Only considering those where the digit is 1

        //Now we have to find the nth magic number
        int n = 5;
        int base = 5;
        int sum = 0;
        while (n>0){
            int lsb = (n & 1);
            sum += lsb*base;
            n = n>>1;
            base = base*5;
        }
        System.out.println(sum);
    }
}
