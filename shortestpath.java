import java.util.*;

class ShortestPathUnweightedGraph {

    public static int bfsShortestPath(Map<Integer, List<Integer>> graph, int source, int destination) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> distance = new HashMap<>();

        queue.add(source);
        visited.add(source);
        distance.put(source, 0);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == destination) {
                return distance.get(current);
            }

            for (int neighbor : graph.get(current)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                    distance.put(neighbor, distance.get(current) + 1);
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3));
        graph.put(2, Arrays.asList(0, 3));
        graph.put(3, Arrays.asList(1, 2, 4));
        graph.put(4, Arrays.asList(3));

        int source = 0;
        int destination = 4;

        int shortestDistance = bfsShortestPath(graph, source, destination);

        if (shortestDistance != -1) {
            System.out.println("Shortest distance from " + source + " to " + destination + " is: " + shortestDistance);
        } else {
            System.out.println("No path exists between " + source + " and " + destination);
        }
    }
}
