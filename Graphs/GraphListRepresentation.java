import java.util.ArrayList;
import java.util.Scanner;

public class GraphListRepresentation {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = buildGraph();
        displayAdjList(adjList);
    }

    static ArrayList<ArrayList<Integer>> buildGraph(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of nodes and edges : ");
        System.out.print("\nNodes : ");
        int n = sc.nextInt();
        System.out.print("\nEdges : ");
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(n);
        for (int i = 0; i <=n ; i++) {
            adjList.add(new ArrayList<>());
        }

        System.out.println("\nEnter "+m+" edges , for example 1 2 or 2 1");
        for (int i = 1; i <= m; i++) {
            System.out.println("Enter edge "+i+" : ");
            int u = sc.nextInt();
            int v = sc.nextInt();

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        return adjList;
    }

    static void displayAdjList(ArrayList<ArrayList<Integer>> adjList){
        System.out.println("Adjacency List of Graph : ");
        int vertex = 0;
        for (ArrayList<Integer> list : adjList){
            System.out.println(vertex+"->"+list);
            vertex++;
        }
    }
}
