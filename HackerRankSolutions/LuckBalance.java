package HackerRankSolutions;
import java.util.*;

public class LuckBalance {
    public static int luckBalance(int k, List<List<Integer>> contests) {
        // Write your code here
        int luck = 0;
        List<Integer> imp = new ArrayList<>();
        for(List<Integer> c : contests){
            if(c.get(1) == 1){
                imp.add(c.get(0));
            }else{
                luck += c.get(0);
            }
        }

        Collections.sort(imp);

        for(int i = imp.size() - 1; i>=0; i--){
            int c = imp.get(i);
            if(k>0){
                luck += c;
                k--;
            }else{
                luck -= c;
            }
        }

        return luck;
    }
}
