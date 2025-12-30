import java.util.*;

class Graph {
    public ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(); ;

    Graph(int size) {
        for (int i = 0; i < size; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addConnection(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void printGraph() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.println(i + " -> " + adjList.get(i));
        }
    }
    public void bfs(int startNode, ArrayList<ArrayList<Integer>> graph) {
    int n = graph.size();
    boolean[] visited = new boolean[n];
    Queue<Integer> q = new LinkedList<>();

    q.add(startNode);
    visited[startNode] = true;

    while (!q.isEmpty()) {
        int node = q.poll();
        System.out.print(node + " ");

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                q.add(neighbor);
            }
        }
    }
}

}

public class GraphArrayList {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addConnection(0, 1);
        graph.addConnection(0, 2);
        graph.addConnection(1, 3);
        graph.addConnection(2, 4);
        graph.printGraph();
        graph.bfs(0, graph.adjList);
    }

}