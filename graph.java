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
