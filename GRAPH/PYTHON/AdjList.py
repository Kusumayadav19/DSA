class Edge:
    def __init__(self, src, dest, weight):
        self.src = src
        self.dest = dest
        self.weight = weight

def adjacenyList():
    V = 5
    # Create a dictionary where the key is a vertex and the value is a list of Edge objects
    graph = {i: [] for i in range(V)}

    # Add edges
    graph[0].append(Edge(0, 1, 5))

    graph[1].append(Edge(1, 0, 5))
    graph[1].append(Edge(1, 2, 3))
    graph[1].append(Edge(1, 3, 1))

    graph[2].append(Edge(2, 1, 3))
    graph[2].append(Edge(2, 3, 4))
    graph[2].append(Edge(2, 4, -1))

    graph[3].append(Edge(3, 1, 1))
    graph[3].append(Edge(3, 2, 4))

    graph[4].append(Edge(4, 2, -1))

    # Printing all neighbors of Vertex 2
    for edge in graph[2]:
        print(edge.src, "->", edge.dest, ": weight", edge.weight)
    
adjacenyList()
