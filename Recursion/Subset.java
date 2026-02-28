package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        //subset("","abc");
        //System.out.println(subset2("","abc"));

        int[] arr = {2,1,2};
        List<List<Integer>> ans = subset4(arr);
        for (List<Integer> l : ans){
            System.out.print(l+" ");
        }
    }

    static void subset(String p, String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);

        subset(p+ch,up.substring(1));
        subset(p,up.substring(1));
    }

    //Returning arrayList
    static ArrayList<String> subset2(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subset2(p+ch,up.substring(1));
        ArrayList<String> right = subset2(p,up.substring(1));

        left.addAll(right);
        return left;
    }

    //Subset Through Iteration :
    static List<List<Integer>> subset3(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr){
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    //Subset of an array which contains duplicate elements
    static List<List<Integer>> subset4(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int start = 0, end = 0;

        for (int i = 0; i< arr.length; i++){
            start = 0;
            if (i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size()-1;

            for (int j = start; j <= end; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
