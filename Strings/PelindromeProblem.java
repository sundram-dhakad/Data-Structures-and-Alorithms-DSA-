package Strings;

public class PelindromeProblem {
    public static void main(String[] args) {
        String series = "abcba";
        System.out.println(isPalindrome(series));

    }
    static boolean isPalindrome(String series){
        int start = 0;
        int end = series.length()-1;

        while (start<end){
            if (series.charAt(start)!= series.charAt(end)){
                return false;
            }
            else {
                start++;
                end--;
            }
        }

        return true;
    }
}
