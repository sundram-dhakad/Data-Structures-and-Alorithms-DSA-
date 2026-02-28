import java.util.ArrayList;
import java.util.Scanner;

public class DFSTraversal {
    public static void main(String[] args) {
        //build adjacency list of graph :
        ArrayList<ArrayList<Integer>> adjList = GraphListRepresentation.buildGraph();

        //display adjacency list
        GraphListRepresentation.displayAdjList(adjList);

        dfsOfGraph(adjList);
    }

    static void dfsOfGraph(ArrayList<ArrayList<Integer>> adjList){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean [] visited = new boolean[adjList.size()];

        System.out.println("Enter start vertex for dfs traversal : ");
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        dfs(start,adjList,visited,ans);

        System.out.println(ans);
    }

    static void dfs(int vertex, ArrayList<ArrayList<Integer>> adjList, boolean [] visited, ArrayList<Integer> ans){
        visited[vertex] = true;
        ans.add(vertex);

        for (Integer neighbour : adjList.get(vertex)){
            if (!visited[neighbour]){
                dfs(neighbour,adjList,visited,ans);
            }
        }
    }
}
