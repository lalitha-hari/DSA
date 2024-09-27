import java.util.*;

class BipartiteGraph {

    // Function to add an edge to the adjacency list
    static void addEdge(List<List<Integer>> adjList, int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    // Function to check if the graph is bipartite using BFS
    static boolean isBipartite(int vertices, List<List<Integer>> adjList) {
        int[] colors = new int[vertices];
        Arrays.fill(colors, -1);  // -1 indicates uncolored vertices

        for (int start = 0; start < vertices; start++) {
            if (colors[start] == -1) {
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(start);
                colors[start] = 0; // Start coloring with color 0

                while (!queue.isEmpty()) {
                    int current = queue.poll();

                    for (int neighbor : adjList.get(current)) {
                        if (colors[neighbor] == -1) {
                            colors[neighbor] = 1 - colors[current]; // Color with opposite color
                            queue.offer(neighbor);
                        } else if (colors[neighbor] == colors[current]) {
                            return false;  // If neighbor has the same color, it's not bipartite
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int vertices = 5;
        List<List<Integer>> adjList = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }

        // Add edges
        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 2, 4);
        addEdge(adjList, 3, 4);  // This edge makes it non-bipartite

        // Check if the graph is bipartite
        if (isBipartite(vertices, adjList)) {
            System.out.println("Graph is bipartite.");
        } else {
            System.out.println("Graph is not bipartite.");
        }
    }
}
