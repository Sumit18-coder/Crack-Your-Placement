public class FloydWarshall {

    public static void floydWarshall(int[][] graph, int V) {
      int[][] dist = new int[V][V];
  
      for (int i = 0; i < V; i++) {
        for (int j = 0; j < V; j++) {
          dist[i][j] = graph[i][j];
        }
      }
  
      for (int k = 0; k < V; k++) {
        for (int i = 0; i < V; i++) {
          for (int j = 0; j < V; j++) {
            // Relaxation step: check if going through vertex k makes the path shorter
            if (dist[i][k] + dist[k][j] < dist[i][j]) {
              dist[i][j] = dist[i][k] + dist[k][j];
            }
          }
        }
      }
      printMatrix(dist);
    }
  
    public static void printMatrix(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          if (matrix[i][j] == Integer.MAX_VALUE) {
            System.out.print("INF ");
          } else {
            System.out.print(matrix[i][j] + " ");
          }
        }
        System.out.println();
      }
    }
  
    public static void main(String[] args) {
      int[][] graph = {
          {0, 3, Integer.MAX_VALUE, 7},
          {Integer.MAX_VALUE, 0, 4, 1},
          {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 5},
          {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0}
      };
      int V = graph.length; 
  
      floydWarshall(graph, V);
    }
  }
  