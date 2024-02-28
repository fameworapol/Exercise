import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Graph {
    private int vertices;
    private List<Edge>[] adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        adjacencyList[source].add(edge);
        edge = new Edge(destination, source, weight);
        adjacencyList[destination].add(edge);
    }

    public List<Edge> findShortestPath(int start, int end) {
        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(vertices, new Node(0,0));
        priorityQueue.add(new Node(start, 0));

        while (!priorityQueue.isEmpty()) {
            int currentNode = priorityQueue.poll().vertex;

            for (Edge edge : adjacencyList[currentNode]) {
                int newDistance = distance[currentNode] + edge.weight;
                if (newDistance < distance[edge.destination]) {
                    distance[edge.destination] = newDistance;
                    priorityQueue.add(new Node(edge.destination, newDistance));
                }
            }
        }

        List<Edge> shortestPath = new ArrayList<>();
        constructPath(shortestPath, start, end,distance);
        return shortestPath;

    }

    private void constructPath(List<Edge> shortestPath, int start, int end,int[] distance) {
        if (start == end)
            return;

        for (Edge edge : adjacencyList[start]) {
            if (distance[start] + edge.weight == distance[edge.destination]) {
                shortestPath.add(edge);
                constructPath(shortestPath, edge.destination, end, distance);
                break;
            }
        }
    }

    class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    class Node implements Comparator<Node> {
        int vertex;
        int distance;

        public Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        public int compare(Node node1, Node node2) {
            return Integer.compare(node1.distance, node2.distance);
        }

    }

    public class ShortestPathExample {
        public static void main(String[] args) {
            int vertices = 6;
            Graph graph = new Graph(vertices);

            // Add edges with weights for the complete graph
            // (You need to specify the actual weights according to your problem)

            // Find shortest path from node 0 to node 5
            int startNode = 0;
            int endNode = 5;
            List<Edge> shortestPath = graph.findShortestPath(startNode, endNode);

            // Print the shortest path
            System.out.println("Shortest Path from " + startNode + " to " + endNode + ":");
            for (Edge edge : shortestPath) {
                System.out.println("Edge: " + edge.source + " -> " + edge.destination);
            }
        }
    }
}
