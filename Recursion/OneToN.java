package Recursion;

public class OneToN {
    public static void main(String[] args) {
        //oneToN(5);
        //ntoOne(6);
        nToOne_OneToN(5);

    }

    //print digits from 1 to n for a given num = n
    static void oneToN(int n){
        if (n==0){
            return;
        }

        //Concept :
        //we can also pass here --n , it will do the same - first it will subtract n by 1 and then pass the value
        //but if we pass n-- , then a problem will arise that it will first pass the value n and then subtract n by 1
        //hence the value of n will never decrease, therefore we should use --n

        oneToN(n-1); //or oneToN(--n)
        System.out.println(n);
    }

    //print digits from n to 1 for a given num = n
    static void ntoOne(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        ntoOne(n-1);
    }

    //print n to 1 and then 1 to n
    static void nToOne_OneToN(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        nToOne_OneToN(n-1);
        System.out.println(n);
    }
}
