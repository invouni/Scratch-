import java.util.*;

public class Graph {
	static class Edge {
		int src;
		int dest;
		int wt;
		Edge(int src, int dest,int wt) {
			this.src = src;
			this.dest = dest;
			this.wt = wt;
		}
	}
//cycle detection undirected graph
        	public static boolean isCyclicUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
		vis[curr] = true;
		for (int i = 0; i < graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
//case1
			if (vis[e.dest] && e.dest != par) {
				boolean isCycle = isCyclicUtil(graph, vis, e.dest, curr);
				if (isCycle)
					return true;
			} else if (e.dest == par) {
//case 2
				continue;
			} else {
//case 3
				return true;
			}
		}
		return false;
	}

	//adding in graph
	static void creat(List<Edge> graph[]) {
		for (int i = 0; i < graph.length; i ++)/*Initializing*/graph[i] = new ArrayList<Edge>();
		//adding elems in graph
		graph[0].add(new Edge(0, 1, 8));

		graph[0].add(new Edge(0, 2, -1));

		graph[1].add(new Edge(1, 0, 3));

		graph[1].add(new Edge(1, 3, 7));

		graph[2].add(new Edge(2, 0, 7));
		graph[2].add(new Edge(2, 4, 9));

		graph[3].add(new Edge(3, 1, 3));

		graph[3].add(new Edge(3, 4, 6));

		graph[3].add(new Edge(3, 5, 100));

		graph[4].add(new Edge(4, 2, 0));

		graph[4].add(new Edge(4, 3, 8));

		graph[4].add(new Edge(4, 5, 7));

		graph[5].add(new Edge(5, 3, 3));

		graph[5].add(new Edge(5, 4, 6));

		graph[5].add(new Edge(5, 6, 5));

		graph[5].add(new Edge(6, 5, 3));

	}
//directed graph
	public static boolean isCyclicUtil(ArrayList<Edge>[] graph, int curr, boolean
									   vis[], boolean stack[]) {
		vis[curr] = true;
		stack[curr] = true;
		for (int i = 0; i < graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if (stack[e.dest]) { //cycle exists
				return true;
			} else if (!vis[e.dest] && isCyclicUtil(graph, e.dest, vis, stack)) {
				return true;
			}
		}
		stack[curr] = false;
		return false;
	}
//O(V + E)
	public static boolean isCyclic(ArrayList<Edge>[] graph) {
		boolean vis[] = new boolean[graph.length];
		for (int i = 0; i < graph.length; i++) {
			if (vis[i] == false) {
				boolean cycle = isCyclicUtil(graph, i, vis, new boolean[vis.length]);
				if (cycle) {
					return true;
				}
			}
		}
		return false;
	}

	static void print(List<Edge> graph[]) {
		for (int i = 0; i < graph.length; i ++) {
			for (int j = 0; j < graph[i].size(); j++) {
				System.out.print("[src is ‐> " + graph[i].get(j).src + " dest is -> " + graph[i].get(j).dest + " wt is -> " + graph[i].get(j).wt +" ]");
			}
			System.out.println();
		}
	}
	//main class
	public static void main(String[] args) {
		List<Edge> graph[] = new ArrayList[6];

		creat(graph);

		print(graph);


	}


}
