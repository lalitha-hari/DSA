def add_edge(adj_list, u, v):
    adj_list[u].append(v)
    adj_list[v].append(u)

def dfs(current, visited, parent, adj_list):
    visited[current] = True
    for neighbor in adj_list[current]:
        if not visited[neighbor]:
            if dfs(neighbor, visited, current, adj_list):
                return True
        elif neighbor != parent:
            return True
    return False

def has_cycle(vertices, adj_list):
    visited = [False] * vertices
    for i in range(vertices):
        if not visited[i]:
            if dfs(i, visited, -1, adj_list):
                return True
    return False

if __name__ == "__main__":
    vertices = 5
    adj_list = [[] for _ in range(vertices)]
    
    add_edge(adj_list, 0, 1)
    add_edge(adj_list, 1, 2)
    add_edge(adj_list, 2, 0)  # This edge creates a cycle
    add_edge(adj_list, 1, 3)
    add_edge(adj_list, 3, 4)

    if has_cycle(vertices, adj_list):
        print("Graph contains a cycle.")
    else:
        print("Graph does not contain a cycle.")
