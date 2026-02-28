package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        //diceSum("",6);
        System.out.println(diceSumRet("",3));

    }

    //Printing all the combination to get target sum
    static void diceSum(String p, int target){
        if (target == 0){
            System.out.print(p+" ");
            return;
        }

        for (int i = 1; i <=6 && i<=target ; i++) {
            diceSum(p+i,target-i);
        }
    }

    //Returning an ArrayList
    static List<String> diceSumRet(String p, int target){
        if (target == 0){
            ArrayList<String> a = new ArrayList<>();
            a.add(p);
            return a;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <=6 && i<=target ; i++) {
            ans.addAll(diceSumRet(p+i,target-i));
        }

        return ans;
    }
}
