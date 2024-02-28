

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DijktraAlgorithms {
    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[][] graph = {
                //0  1  2  3  4  5  6  7  8
                { 0, 1, 0, 1, 0, 0, 0, 0, 0 }, // 0
                { 1, 0, 1, 0, 1, 0, 0, 0, 0 }, // 1
                { 0, 1, 0, 0, 0, 1, 0, 0, 0 }, // 2
                { 1, 0, 0, 0, 1, 0, 1, 0, 0 }, // 3
                { 0, 1, 0, 1, 0, 1, 0, 1, 0 }, // 4
                { 0, 0, 1, 0, 1, 0, 0, 0, 1 }, // 5
                { 0, 0, 0, 1, 0, 0, 0, 1, 0 }, // 6
                { 8, 0, 0, 0, 1, 0, 1, 0, 1 }, // 7
                { 0, 0, 0, 0, 0, 1, 0, 1, 0 } // 8
        };

        System.out.println(graph);
        // createGraph(36);

        dijkstra(graph, 0, 5);
    }

    // private static int[][] createGraph(Integer dimension) {
    //     int[][] graph = new int[dimension][dimension];
    //     for (int i = 0; i < graph.length; i++) {
    //         int[] children = graph[i];
    //         graph[i][i + 1] = 1;
    //         if (i - 1 > 0) {
    //             graph[i][i - 1] = 1;
    //         }

    //         graph[i][i + dimension] = 1;
    //         graph[i][i - dimension] = 1;
    //     }
    //     System.out.println(graph);
    //     return null;
    // }

    private static void dijkstra(int[][] graph, int source, int destination) {
        int vertices = graph.length;
        int[] dist = new int[vertices];
        int[] pred = new int[vertices];
        String[] direction = new String[vertices]; // เพิ่ม array เก็บทิศทาง
        boolean[] visited = new boolean[vertices];

        Arrays.fill(dist, INF);
        Arrays.fill(pred, -1);
        Arrays.fill(direction, "");

        dist[source] = 0;

        for (int count = 0; count < vertices - 1; count++) {
            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < vertices; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != INF &&
                        dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                    pred[v] = u;
                    direction[v] = getDirection(u, v); // บันทึกทิศทาง
                }
            }
        }

        printSolution(dist, pred, direction, source, destination);
    }

    private static int minDistance(int[] dist, boolean[] visited) {
        int min = INF, minIndex = -1;

        for (int v = 0; v < dist.length; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    private static String getDirection(int u, int v) {
        // ตั้งค่าทิศทางตามตำแหน่งของ u และ v
        if (u == v)
            return ""; // ไม่ต้องการเพิ่มทิศทางสำหรับตำแหน่งเดียวกัน

        int dx = v - u;
        int dy = u / 3 - v / 3;

        if (dx == 1)
            return "E";
        if (dx == -1)
            return "W";
        if (dy == 1)
            return "N";
        if (dy == -1)
            return "S";

        return "";
    }

    private static void printSolution(int[] dist, int[] pred, String[] direction, int source, int destination) {
        System.out.println("Shortest Distance to Destination (" + destination + "): " + dist[destination]);
        System.out.print("Shortest Path: ");
        printPath(pred, direction, destination);
    }

    private static void printPath(int[] pred, String[] direction, int destination) {
        List<Integer> path = new ArrayList<>();
        int current = destination;

        while (current != -1) {
            path.add(current);
            current = pred[current];
        }

        for (int i = path.size() - 1; i >= 0; i--) {
            int node = path.get(i);
            String dir = direction[node];
            if (!dir.isEmpty()) {
                System.out.print(dir + " ");
            }
            System.out.print(node + " ");
        }
        System.out.println();
    }
}
