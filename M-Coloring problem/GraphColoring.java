public class GraphColoring {
    public boolean graphColoring(int[][] graph, int m, int n) {
        int[] color = new int[n]; // Initialize all colors as 0 (unassigned)
        return canColorGraph(graph, m, color, 0, n);
    }

    private boolean canColorGraph(int[][] graph, int m, int[] color, int vertex, int n) {
        if (vertex == n) {
            return true; // All vertices are colored
        }

        // Try assigning each color from 1 to m
        for (int c = 1; c <= m; c++) {
            if (isSafeToColor(graph, color, vertex, c)) {
                color[vertex] = c; // Assign color c to vertex
                if (canColorGraph(graph, m, color, vertex + 1, n)) {
                    return true; // Found a valid coloring
                }
                color[vertex] = 0; // Backtrack
            }
        }
        return false; // No valid coloring found
    }

    private boolean isSafeToColor(int[][] graph, int[] color, int vertex, int c) {
        for (int i = 0; i < graph.length; i++) {
            if (graph[vertex][i] == 1 && color[i] == c) {
                return false; // Adjacent vertex has the same color
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int N = 4;
        int M = 3;
        int[][] graph = {
            {0, 1, 1, 1},
            {1, 0, 1, 0},
            {1, 1, 0, 1},
            {1, 0, 1, 0}
        };

        GraphColoring coloring = new GraphColoring();
        if (coloring.graphColoring(graph, M, N)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
