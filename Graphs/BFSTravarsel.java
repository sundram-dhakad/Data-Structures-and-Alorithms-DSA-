import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSTravarsel {
    public static void main(String[] args) {
        //build adjacency list of graph :
        ArrayList<ArrayList<Integer>> adjList = GraphListRepresentation.buildGraph();

        //display adjacency list
        GraphListRepresentation.displayAdjList(adjList);

        bfs(adjList);
    }

    //BFS Traversal
    static void bfs(ArrayList<ArrayList<Integer>> adjList){
        int n = adjList.size();
        boolean [] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start vertex for bfs traversal : ");
        int start = sc.nextInt();

        q.add(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int top = q.peek();
            ArrayList<Integer> neighbours = adjList.get(top);
            for (Integer neighbour : neighbours){
                if(!visited[neighbour]){
                   q.add(neighbour);
                   visited[neighbour] = true;
                }
            }
            ans.add(q.poll());
        }
        System.out.println("\nBFS : "+ans);
    }
}
