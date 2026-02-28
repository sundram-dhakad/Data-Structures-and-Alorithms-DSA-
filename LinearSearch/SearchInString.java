package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "sundram";
        char target = 'd';

        boolean ans = search2(name,target);
        System.out.println(ans);
    }

    //using for-each loop
    static boolean search2(String name, char target){
        if (name.length() == 0){
            return false;
        }
        for(char ch : name.toCharArray()){
            if (target == ch);
            return true;
        }
        return false;
    }

    //using for loop
    static boolean search(String name, char target){
        if (name.isEmpty()){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)){
                return true;
            }
        }
      return false;
    }
}