package LeetCodeSolutions;
import java.util.*;

public class WordLadder2 {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("a");
        wordList.add("b");
        wordList.add("c");
        List<List<String>> finalAns = findLadders("a","c",wordList);

        for (int i = 0; i <finalAns.size() ; i++) {
            System.out.println(finalAns.get(i));
        }
    }
    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> ans = new ArrayList<>();
        Set<String> set = new HashSet<>(wordList);
        set.remove(beginWord);

        ArrayList<String> list = new ArrayList<>();
        list.add(beginWord);

        Queue<List<String>> q = new LinkedList<>();
        q.add(list);

        while(!q.isEmpty()){
            List<String> currList = q.remove();
            StringBuilder currWord = new StringBuilder(currList.get(currList.size()-1));

            for(int i = 0; i<currWord.length(); i++){
                char orgChar = currWord.charAt(i);

                for (char ch = 'a'; ch <= 'z'; ch++) {
                    currWord.setCharAt(i, ch);

                    if(set.contains(currWord.toString())){
                        List<String> temp = new ArrayList<>(currList);
                        temp.add(currWord.toString());
                        if(currWord.toString().equals(endWord)){
                            ans.add(temp);
                            break;
                        }else{
                            q.add(temp);
                            set.remove(currWord.toString());
                        }
                    }
                }
                currWord.setCharAt(i, orgChar);
            }

        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i<ans.size(); i++){
            if(ans.get(i).size()<min){
                min = ans.get(i).size();
            }
        }

        int j = 0;
        while(j<ans.size()){
            if(ans.get(j).size()>min){
                ans.remove(j);
            }else{
                j++;
            }
        }

        return ans;
    }
}
