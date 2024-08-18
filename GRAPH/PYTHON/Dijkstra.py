# Dijkstra's Algorithm - Shortest Path from source to all vertices

import heapq

def dijkstra(matrix, vertices, src):
    # Priority queue for the vertices to process
    queue = []
    
    # Distance array, initialized to infinity
    dist = [float('inf')] * vertices
    dist[src] = 0

    # Visited set
    visited = [False] * vertices

    # Build adjacency list from matrix
    adjList = [[] for _ in range(vertices)]
    for edge in matrix:
        adjList[edge[0]].append((edge[1], edge[2]))

    # Add source node to the queue
    heapq.heappush(queue, (0, src))

    while queue:
        currDist, u = heapq.heappop(queue)
        
        if visited[u]:
            continue
        
        visited[u] = True

        for v, weight in adjList[u]:
            if currDist + weight < dist[v]:
                dist[v] = currDist + weight
                heapq.heappush(queue, (dist[v], v))

    return dist

edges = [(0, 1, 4), (0, 2, 4), (1, 2, 2), (2, 3, 3), (2, 4, 1),(2, 5, 6), (3, 5, 2),(4, 5, 3)]
vertices = 6
src = 0
print(dijkstra(edges, vertices, src))