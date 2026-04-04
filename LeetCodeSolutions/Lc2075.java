package LeetCodeSolutions;

public class Lc2075 {
    public static void main(String[] args) {
        System.out.println(decodeCiphertext("iveo    eed   l te   olc",4));
    }
    //solution
    static String decodeCiphertext(String encodedText, int rows) {
        int n = encodedText.length();
        int cols = n / rows;

        char[][] matrix = new char[rows][cols];

        //storing encoded string
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = encodedText.charAt(k);
                k++;
            }
        }

        //obtaining original string
        k = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cols; i++) {
            int r = 0;
            int c = i;

            while (r < rows && c < cols) {
                sb.append(matrix[r][c]);
                r++;
                c++;
            }
        }

        return sb.toString().stripTrailing();
    }}
