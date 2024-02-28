package Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class ShortestPathExample {
    static final int vertices = 6;

    public static void main(String[] args) {
        int[][] graph = new int[vertices][vertices];

        // Add edges for the unweighted graph

        int startNode = 0;
        int endNode = 5;
        List<Integer> shortestPath = dijkstra(graph, startNode, endNode);

        // Print the shortest path
        System.out.println("Shortest Path from " + startNode + " to " + endNode + ":");
        for (Integer node : shortestPath) {
            System.out.print(node + " ");
        }
    }

    static List<Integer> dijkstra(int[][] graph, int start, int end) {
        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(vertices,
                Comparator.comparingInt(node -> node.distance));
        priorityQueue.add(new Node(start, 0));

        while (!priorityQueue.isEmpty()) {
            Node current = priorityQueue.poll();
            int currentNode = current.vertex;

            for (int neighbor = 0; neighbor < vertices; neighbor++) {
                if (graph[currentNode][neighbor] == 1) { // Unweighted graph
                    int newDistance = distance[currentNode] + 1; // 1 is the weight for unweighted graph
                    if (newDistance < distance[neighbor]) {
                        distance[neighbor] = newDistance;
                        priorityQueue.add(new Node(neighbor, newDistance));
                    }
                }
            }
        }

        List<Integer> shortestPath = new ArrayList<>();
        constructPath(shortestPath, start, end, graph, distance);
        return shortestPath;
    }

    static void constructPath(List<Integer> shortestPath, int start, int end, int[][] graph, int[] distance) {
        if (start == end)
            return;

        for (int j = 0; j < vertices; j++) {
            if (graph[start][j] == 1 && distance[start] + 1 == distance[j]) {
                shortestPath.add(j);
                constructPath(shortestPath, j, end,graph,distance);
                break;
            }
        }
    }

    static class Node {
        int vertex;
        int distance;

        public Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }
}