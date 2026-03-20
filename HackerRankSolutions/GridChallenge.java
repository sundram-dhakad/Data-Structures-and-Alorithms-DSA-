package HackerRankSolutions;
import java.util.*;

public class GridChallenge {
    //Solution :
    public static String gridChallenge(List<String> grid) {
        int n = grid.size();
        int m = grid.get(0).length();

        for(int i = 0; i<n; i++) {
            String s = grid.get(i);
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            grid.set(i, new String(arr));
        }

        for(int i = 0; i<m; i++) { //-> 0,1,2 cols
            for(int j = 1; j<n; j++){ //rows
                if(grid.get(j-1).charAt(i) > grid.get(j).charAt(i)) return "NO";
            }
        }
        return "YES";
    }
}
