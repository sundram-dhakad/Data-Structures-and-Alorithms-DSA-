package Recursion;

import java.util.*;

public class LetterCombination {
    public static void main(String[] args) {
        String digits = "";
        System.out.println(letterCombinations(digits));
    }

    static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()){
            return new ArrayList<>();
        }

        HashMap<Character,String> mp = new HashMap<>();
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");

        return helper("",digits,mp);
    }

    static List<String> helper(String p, String up, HashMap<Character,String> mp ) {
        if (up.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        char ch = up.charAt(0);
        String value = mp.get(ch);

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < value.length(); i++) {
            List<String> temp = helper(p+value.charAt(i),up.substring(1),mp);
            ans.addAll(temp);
        }
        return ans;
    }

}
