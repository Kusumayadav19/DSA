package DSA.GRAPH.JAVA;
import java.util.*;


public class AdjList{
    // Can be implemented using ArrayList of ArrayList, Array of ArrayList or hashMap<Integer, List>
    static class Edge{
        int src;
        int dest;
        int wet;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wet = w;
        }
    }
    public static void main(String[] args) {
        int V = 5;
        HashMap<Integer,ArrayList<Edge>> graph = new HashMap<>();  // Array is Graph and type of ArrayList of edges

       // Initialize the graph with empty adjacency lists
        for (int i = 0; i < V; i++) {
            graph.put(i, new ArrayList<>());
        }
    
        // Add edges
        graph.get(0).add(new Edge(0, 1, 5));
        
        graph.get(1).add(new Edge(1, 0, 5));
        graph.get(1).add(new Edge(1, 2, 3));
        graph.get(1).add(new Edge(1, 3, 1));
        
        graph.get(2).add(new Edge(2, 1, 3));
        graph.get(2).add(new Edge(2, 3, 4));
        graph.get(2).add(new Edge(2, 4, -1));
        
        graph.get(3).add(new Edge(3, 1, 1));
        graph.get(3).add(new Edge(3, 2, 4));
        
        graph.get(4).add(new Edge(4, 2, -1));
        
        // Printing all neighbors of Vertex 2
        ArrayList<Edge> edges = graph.get(2);
        for (Edge e : edges) {
            System.out.println(e.src + " -> " + e.dest + ": weight " + e.wet);
        }
    }
}
