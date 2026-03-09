package HackerRankSolutions;
import java.util.*;

//Problem Link : https://www.hackerrank.com/challenges/waiter/problem?isFullScreen=true

public class Waiter {
    //Solution :
    public static List<Integer> waiter(List<Integer> number, int q) {
        int[] primes = new int[q];
        int p = 2;
        for(int i = 0; i<q; i++){
            boolean primeFound = false;
            while(!primeFound){
                boolean divisible = false;
                for(int j = 2; j<p; j++){
                    if(p % j == 0){
                        divisible = true;
                        break;
                    }
                }

                if(!divisible){
                    primeFound = true;
                }else{
                    p++;
                }
            }

            primes[i] = p;
            p++;
        }

        Stack<Integer> st = new Stack<>();
        for(int e : number){
            st.push(e);
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<q; i++){
            Stack<Integer> a = new Stack<>();
            Stack<Integer> b = new Stack<>();

            int cp = primes[i];
            while(!st.isEmpty()){
                int curr = st.pop();
                if(curr % cp == 0){
                    b.push(curr);
                }else{
                    a.push(curr);
                }
            }

            while(!b.isEmpty()){
                ans.add(b.pop());
            }

            st = a;
        }

        while(!st.isEmpty()){
            ans.add(st.pop());
        }

        return ans;
    }
}
