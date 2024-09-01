import java.util.LinkedList;
public class GraphDFS {
    private static final int v = 0;
    private int vertices;
    private LinkedList<Integer>[] adjacentList;
    
    //constructor
    public GraphDFS(int v){
       vertices = v;
       adjacentList = new LinkedList[v];
       for(int i = 0;i < v; i++){
        adjacentList[i] = new LinkedList<>();
       }
    }
    //add edge method
    public void addEdge(int v,int w){
       adjacentList[v].add(w);
    }
    public void DFS(int startvertex){
       boolean[] visited = new boolean[vertices];
       DFSUtil(startvertex,visited);
    }
    private void DFSUtil(int vertex,boolean[] visited){
       visited[vertex] = true;
       System.out.print(vertex+ "");
       //recur for all the vertices adjacent to this vertex
       for(int adjacent: adjacentList[vertex]){
        if(!visited[adjacent]){
            DFSUtil(adjacent,visited);
        }
       }
    }
    public static void main(String[] args) {
       GraphDFS graph = new GraphDFS(4);
       graph.addEdge(0,1); 
       graph.addEdge(0,2);
       graph.addEdge(0,1);
       graph.addEdge(0,1);
       graph.addEdge(0,1);
       graph.addEdge(0,1);

       System.out.println("Depth first traversal from vertex 2 : ");
       graph.DFS(2);
    }
}
