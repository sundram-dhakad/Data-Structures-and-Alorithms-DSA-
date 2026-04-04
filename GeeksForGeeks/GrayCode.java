package GeeksForGeeks;
import java.util.ArrayList;

public class GrayCode {
    public static void main(String[] args) {
        ArrayList<String> result = graycode(3);
        System.out.println(result);
    }
    //solution
   static ArrayList<String> graycode(int n) {
        ArrayList<String> ans = new ArrayList<>();

        int range = 1<<n;

        for(int j = 0; j<range; j++){
            StringBuilder binary = new StringBuilder(Integer.toBinaryString(j));
            binary.insert(0,"0".repeat(n-binary.length())); //appending extra zero in front

            StringBuilder gray = new StringBuilder();
            gray.append(binary.charAt(0));
            for(int i = 1; i<n; i++){
                int prev = binary.charAt(i-1) - '0';
                int curr = binary.charAt(i) - '0';
                int xor = prev^curr;
                gray.append(""+xor);
            }

            ans.add(gray.toString());
        }

        return ans;
    }
}
