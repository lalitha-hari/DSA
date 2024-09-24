import java.util.Stack;
import java.util.*;

class Graph {
    private int vertices;  // Number of vertices
    private List<Integer>[] adjacencyList;  // Adjacency list array

    // Constructor
    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    // Method to perform DFS traversal from a given vertex
    public void dfs(int startVertex) {
        // Create a boolean array to mark visited vertices
        boolean[] visited = new boolean[vertices];
        // Stack to store the vertices for DFS
        Stack<Integer> stack = new Stack<>();

        // Push the starting vertex to the stack
        stack.push(startVertex);

        // Perform DFS
        while (!stack.isEmpty()) {
            // Pop a vertex from the stack
            int vertex = stack.pop();

            // If this vertex hasn't been visited
            if (!visited[vertex]) {
                // Mark the vertex as visited and print it
                visited[vertex] = true;
                System.out.print(vertex + " ");
            }

            // Push all adjacent vertices to the stack
            for (int adjVertex : adjacencyList[vertex]) {
                if (!visited[adjVertex]) {
                    stack.push(adjVertex);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create a graph with 4 vertices
        Graph graph = new Graph(4);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        // Perform DFS starting from vertex 2
        System.out.println("Depth First Traversal starting from vertex 2:");
        graph.dfs(2);
    }
}
