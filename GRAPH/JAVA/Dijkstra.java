package DSA.GRAPH.JAVA;

import java.util.*;

// Dijkstra's Algorithm - Shortest Path from source to all vertices

public class Dijkstra{
    static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
    private static int[] ShortestPath(int[][] matrix, int vertices, int src){
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        List<List<Edge>> adjList = new ArrayList<>(vertices);
        int[] dist = new int[vertices];
        int[] visited = new int[vertices]; 

        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;

        // Build adjacency list from matrix
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < matrix.length; i++) {
            adjList.get(matrix[i][0]).add(new Edge(matrix[i][0], matrix[i][1], matrix[i][2]));
        }

        // Add source node to the queue
        queue.add(new int[]{0, src});

        while(!queue.isEmpty()){
            int[] pair  = queue.poll();

            if(visited[pair[1]] ==  1){
                continue;
            }
            visited[pair[1]] = 1;

            for (Edge edge : adjList.get(pair[1])) {
                if (pair[0] + edge.weight < dist[edge.dest]) {
                    dist[edge.dest] = pair[0] + edge.weight;
                    queue.offer(new int[] { dist[edge.dest], edge.dest });
                }
            }
        }
         return dist;
    }
    public static void main(String[] args) {
        int[][] edges = {{0, 1, 4}, {0, 2, 4}, {1, 2, 2}, {2, 3, 3}, {2, 4, 1}, {2, 5, 6}, {3, 5, 2}, {4, 5, 3}};
        System.out.println(Arrays.toString(ShortestPath(edges, 6, 0)));
    }
}

