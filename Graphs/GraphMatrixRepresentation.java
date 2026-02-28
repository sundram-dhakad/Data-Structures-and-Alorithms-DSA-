import java.util.Arrays;

public class GraphMatrixRepresentation {
    public static void main(String[] args) {
       int [][] graph = new int[6][6];

       /*
       Edges :-
       1-2
       1-3
       2-3
       2-4
       2-5
       3-5
       4-5
        */

        //edge 1-2
        graph[1][2] = 1;
        graph[2][1] = 1;

        //edge 1-3
        graph[1][3] = 1;
        graph[3][1] = 1;

        //edge 2-3
        graph[2][3] = 1;
        graph[3][2] = 1;

        //edge 2-4
        graph[2][4] = 1;
        graph[4][2] = 1;

        //edge 2-5
        graph[2][5] = 1;
        graph[5][2] = 1;

        //edge 3-5
        graph[3][5] = 1;
        graph[5][3] = 1;

        //edge 4-5
        graph[4][5] = 1;
        graph[5][4] = 1;

        int i = 0;
        System.out.println("   0  1  2  3  4  5");
        for(int[] row : graph){
            System.out.println(i+" "+Arrays.toString(row));
            i++;
        }
    }
}
