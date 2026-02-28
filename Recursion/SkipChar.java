package Recursion;

public class SkipChar {
    public static void main(String[] args) {
       // System.out.println(skip("badmaash"));
        System.out.println(skipApple("sljfjlapplekhjk"));
    }

    //this will return the string by skipping all the 'a'
    static String skip(String s){
        if (s.isEmpty()){
            return "";
        }

        char ch = s.charAt(0);

        if (ch == 'a'){
            return skip(s.substring(1));
        }else {
            return (ch+skip(s.substring(1)));
        }
    }

    //this will return a string by skipping string = "apple" from a string
    static String skipApple(String s){
        if (s.length()<5){
            return s;
        }

        if (s.startsWith("apple")){
            return skipApple(s.substring(5));
        }
        else {
            return s.charAt(0)+skipApple(s.substring(1));
        }
    }

}
