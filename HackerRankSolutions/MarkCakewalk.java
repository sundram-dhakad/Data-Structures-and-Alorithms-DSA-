package HackerRankSolutions;
import  java.util.*;

public class MarkCakewalk {
    public static long marcsCakewalk(List<Integer> calorie) {
        // Write your code here
        Collections.sort(calorie);

        int n = calorie.size();
        long ans = 0;
        for(int i = 0; i<n; i++){
            ans += (long)(Math.pow(2,i) * calorie.get(n-i-1));
        }

        return ans;
    }
}
