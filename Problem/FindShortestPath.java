package Problem;

import java.util.ArrayList;
import java.util.List;

public class FindShortestPath {
    private int[][] adjacencyMatrix;
    private int vertices;

    public FindShortestPath(int vertices) {
        this.vertices = vertices;
        this.adjacencyMatrix = new int[vertices][vertices];
        initializeMatrixWithOnes();
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1;

    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void initializeMatrixWithOnes() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                adjacencyMatrix[i][j] = 1; // You can set this to any other value you want
            }
        }
    }

    public static void main(String[] args) {
        int numberOfVertices = 6;
        FindShortestPath graph = new FindShortestPath(numberOfVertices);
        graph.printGraph();
    }

    public static List<String> findShortestPath() {

        return new ArrayList<>(List.of("1", "2", "3","4"));
    }

}
