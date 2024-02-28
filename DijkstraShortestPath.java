
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DijkstraShortestPath {

    public static void main(String[] args) {
        // สร้างกราฟและเพิ่มข้อมูล
        Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();

        addEdge(graph, 0, 1, 1);
        addEdge(graph, 0, 3, 1);
        addEdge(graph, 1, 0, 1);
        addEdge(graph, 1, 2, 1);
        addEdge(graph, 1, 4, 1);
        addEdge(graph, 2, 1, 1);
        addEdge(graph, 2, 5, 1);
        addEdge(graph, 3, 0, 1);
        addEdge(graph, 3, 4, 1);
        addEdge(graph, 3, 6, 1);
        addEdge(graph, 4, 1, 1);
        addEdge(graph, 4, 3, 1);
        addEdge(graph, 4, 5, 1);
        addEdge(graph, 4, 7, 1);
        addEdge(graph, 5, 2, 1);
        addEdge(graph, 5, 4, 1);
        addEdge(graph, 5, 8, 1);
        addEdge(graph, 6, 3, 1);
        addEdge(graph, 6, 7, 1);
        addEdge(graph, 7, 6, 1);
        addEdge(graph, 7, 4, 1);
        addEdge(graph, 7, 8, 1);
        addEdge(graph, 8, 5, 1);
        addEdge(graph, 8, 7, 1);

        // หา shortest path จากจุด 0 ไป 4
        int source = 0;
        int destination = 8;
        int dimension = 3;
        Map<Integer, Integer> pred = dijkstra(graph, source, destination);

        // แสดงผลลัพธ์
        printShortestPath(pred, source, destination, dimension);
    }

    private static void addEdge(Map<Integer, Map<Integer, Integer>> graph, int source, int destination, int weight) {
        graph.putIfAbsent(source, new HashMap<>());
        graph.get(source).put(destination, weight);

        // เพิ่มเส้นเชื่อมทวนกัน (กราฟไม่ทิศเข้า-ออก)
        graph.putIfAbsent(destination, new HashMap<>());
        graph.get(destination).put(source, weight);
    }

    private static Map<Integer, Integer> dijkstra(Map<Integer, Map<Integer, Integer>> graph, int source,
            int destination) {
        Map<Integer, Integer> dist = new HashMap<>(); // เก็บระยะทางที่สั้นที่สุดจากจุดเริ่มต้น
        Map<Integer, Integer> pred = new HashMap<>(); // เก็บจุดที่เป็น predecessor ของแต่ละจุด
        Set<Integer> visited = new HashSet<>();

        // กำหนดระยะทางเริ่มต้น
        for (int vertex : graph.keySet()) {
            dist.put(vertex, Integer.MAX_VALUE);
            pred.put(vertex, null);
        }
        dist.put(source, 0);

        while (!visited.contains(destination)) {
            int currentVertex = minDistance(dist, visited);
            visited.add(currentVertex);

            Map<Integer, Integer> neighbors = graph.get(currentVertex);

            for (int neighbor : neighbors.keySet()) {
                if (!visited.contains(neighbor)) {
                    int tentativeDistance = dist.get(currentVertex) + neighbors.get(neighbor);
                    if (tentativeDistance < dist.get(neighbor)) {
                        dist.put(neighbor, tentativeDistance);
                        pred.put(neighbor, currentVertex);
                    }
                }
            }
        }

        return pred;
    }

    private static int minDistance(Map<Integer, Integer> dist, Set<Integer> visited) {
        int min = Integer.MAX_VALUE;
        int minVertex = -1;

        for (int vertex : dist.keySet()) {
            if (!visited.contains(vertex) && dist.get(vertex) < min) {
                min = dist.get(vertex);
                minVertex = vertex;
            }
        }

        return minVertex;
    }

    private static void printShortestPath(Map<Integer, Integer> pred, int source, int destination, int dimension) {
        List<Integer> path = new ArrayList<>();
        Integer current = destination;

        while (current != null) {
            path.add(current);
            current = pred.get(current);
        }

        Collections.reverse(path);

        // แสดงผลลัพธ์พร้อมทิศทาง
        System.out.print("Shortest Path from " + source + " to " + destination + ": ");
        for (int i = 0; i < path.size() - 1; i++) {
            int from = path.get(i);
            int to = path.get(i + 1);
            String direction = getDirection(from, to, dimension);
            System.out.print(from + " (" + direction + ") -> ");
        }
        System.out.println(path.get(path.size() - 1));
    }

    private static String getDirection(int from, int to, int dimension) {
        // ตั้งค่าทิศทางตามตำแหน่งของ from และ to
        if (to - from == 1)
            return "E";
        if (to - from == -1)
            return "W";
        if (to - from == dimension)
            return "S";
        if (to - from == -dimension)
            return "N";
        return "";
    }
}
