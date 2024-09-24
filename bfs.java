import java.util.*;

class Graph {
    private int vertices; 
    private List<Integer>[] adjacencyList;

  
    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }


    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    
    void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();  

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {

            int vertex = queue.poll();
            System.out.print(vertex + " ");

            
            for (int adjVertex : adjacencyList[vertex]) {
                if (!visited[adjVertex]) {
                    visited[adjVertex] = true;
                    queue.add(adjVertex);  
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

        // Perform BFS starting from vertex 2
        System.out.println("Breadth First Traversal starting from vertex 2:");
        graph.bfs(2);
    }
}
