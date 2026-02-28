package MathsPractice;

public class HCFandLCM {
    public static void main(String[] args) {
        //System.out.println(gcd(60,25));
        System.out.println(lcm(15,20));
    }

    //Euclidean Algorithm to find GCD :
    static int gcd(int a, int b){
        if (a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    //Method to find LCM
    static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
