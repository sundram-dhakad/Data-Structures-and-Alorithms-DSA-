package LeetCodeSolutions;

public class Lc1545 {
    public static void main(String[] args) {
        System.out.println(findKthBit(3,1));
    }
    static char findKthBit(int n, int k) {
        if(k == 0) return '0';
        StringBuilder s = new StringBuilder("0"); //since s1 = "0"

        for(int i = 2; i<=n; i++){ //calculate s2 to sn
            int l = s.length();
            int m = l/2;
            StringBuilder temp = new StringBuilder(s);

            s.append(1);

            if(s.charAt(m) == '0'){
                temp.setCharAt(m,'1');
            }else{
                temp.setCharAt(m,'0');
            }

            s.append(temp);
        }

        return s.charAt(k-1);
    }
}
