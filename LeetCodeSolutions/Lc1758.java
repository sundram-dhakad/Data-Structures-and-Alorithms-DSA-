package LeetCodeSolutions;

//1784. Check if Binary String Has at Most One Segment of Ones
/*
You are given a string s consisting only of the characters '0' and '1'. In one operation, you can change any '0' to '1' or vice versa.
The string is called alternating if no two adjacent characters are equal. For example, the string "010" is alternating, while the string "0100" is not.
Return the minimum number of operations needed to make s alternating.
 */

public class Lc1758 {
    public int minOperations(String s) {
        int n = s.length();
        char hypo = '0';
        int count1 = 0;

        //checking for 010101.....
        for (char ch : s.toCharArray()) {
            if (ch != hypo)
                count1++;

            hypo = hypo == '0' ? '1' : '0';
        }

        hypo = '1';
        int count2 = 0;
        //checking for 101010.....
        for (char ch : s.toCharArray()) {
            if (ch != hypo)
                count2++;

            hypo = hypo == '0' ? '1' : '0';
        }

        return Math.min(count1, count2);
    }
}
