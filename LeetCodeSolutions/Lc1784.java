package LeetCodeSolutions;

//1784. Check if Binary String Has at Most One Segment of Ones
/*
Given a binary string s without leading zeros, return true if s contains at most one contiguous segment of ones. Otherwise, return false.
*/

public class Lc1784 {
    public boolean checkOnesSegment(String s) {
        boolean zeroFound = false;
        for (char ch : s.toCharArray()) {
            if (ch == '1' && zeroFound) {
                return false;
            } else if (ch == '0') {
                zeroFound = true;
            }
        }
        return true;
    }
}
