package Recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
       permutation("","abc");
       //ArrayList<String> result = permutationRet("","abc");
        //System.out.println(result);
        //System.out.println(permutationCount("","abc"));

    }

    //Printing
    static void permutation(String p, String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i);

            permutation(first+ch+second, up.substring(1));

        }
    }

    //Returning ArrayList
    static ArrayList<String> permutationRet(String p, String up){

        if (up.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i);

            ans.addAll(permutationRet(first+ch+second, up.substring(1)));
        }
        return ans;
    }

    //Returning count
    static int permutationCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);

        int count = 0;

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i);

            count += permutationCount(first+ch+second, up.substring(1));
        }
        return count;
    }
}
