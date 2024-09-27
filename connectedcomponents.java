import java.util.ArrayList;
import java.util.List;

 class ConnectedComponents {

    
    static void addEdge(List<List<Integer>> adjList, int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

  
    static void dfs(int vertex, boolean[] visited, List<List<Integer>> adjList) {
        visited[vertex] = true;
        for (int neighbor : adjList.get(vertex)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adjList);
            }
        }
    }

    
    static int countConnectedComponents(int vertices, List<List<Integer>> adjList) {
        boolean[] visited = new boolean[vertices];
        int count = 0;

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {  
                dfs(i, visited, adjList);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int vertices = 7;
        List<List<Integer>> adjList = new ArrayList<>();

    
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }

        // Add edges
        addEdge(adjList, 0, 1);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 3, 4);
        addEdge(adjList, 5, 6);

        // Find and print the number of connected components
        int numComponents = countConnectedComponents(vertices, adjList);
        System.out.println("Number of connected components: " + numComponents);
    }
}
