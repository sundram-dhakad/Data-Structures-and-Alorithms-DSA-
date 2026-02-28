package BinarySearch;

public class SmallestCharacter {
    public static void main(String[] args) {
        //Array sorted in ascending order
        char[] letters = {'c','f','j'};
        char target = 'f';

        char ans = smallestCharacter(letters,target);
        System.out.println(ans);

    }

    //return smallest character greater than target
    //if target = 'z' and arr=['a','b'] then return 'a'

    static char smallestCharacter(char[]letters, char target){
        int start = 0;
        int end = letters.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];

//        if (start>=letters.length){
//            return letters[0];
//        }
//        else {
//            return letters[start];
//        }
    }
}
