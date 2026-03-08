package LeetCodeSolutions.WeeklyContest492;

//3864. Minimum Cost to Partition a Binary String
/*
You are given a binary string s and two integers encCost and flatCost.
For each index i, s[i] = '1' indicates that the ith element is sensitive, and s[i] = '0' indicates that it is not.
The string must be partitioned into segments. Initially, the entire string forms a single segment.
For a segment of length L containing X sensitive elements:
If X = 0, the cost is flatCost.
If X > 0, the cost is L * X * encCost.
If a segment has even length, you may split it into two contiguous segments of equal length and the cost of this split is the sum of costs of the resulting segments.
Return an integer denoting the minimum possible total cost over all valid partitions.
 */

public class Lc3864 {
    public long minCost(String s, int encCost, int flatCost) {
        long l = s.length();
        if(l == 1){
            if(s.charAt(0) == '0') return flatCost;
            return encCost;
        }

        long x = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1') x++;
        }

        if(x == 0) return (long)flatCost;

        long left = (l*x*encCost);
        if(l % 2 != 0) return left;

        long right = (long)minCost(s.substring(0,(int)l/2), encCost, flatCost) + (long)minCost(s.substring((int)l/2,(int)l), encCost, flatCost);

        return Math.min(left,right);
    }
}
