import java.util.*;

public class Graph {
//class edge
	static class Edge {
		int src;
		int dest;
		Edge(int src, int dest) {
			this.src = src;
			this.dest = dest;
		}
	}

	//adding in graph
	static void creat(List<Edge> graph[]) {
		for (int i = 0; i < graph.length; i ++)/*Initializing*/graph[i] = new ArrayList<Edge>();
		//adding elems in graph
		graph[0].add(new Edge(0, 1));

		graph[0].add(new Edge(0, 2));

		graph[1].add(new Edge(1, 0));

		graph[1].add(new Edge(1, 3));

		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 4));

		graph[3].add(new Edge(3, 1));

		graph[3].add(new Edge(3, 4));

		graph[3].add(new Edge(3, 5));

		graph[4].add(new Edge(4, 2));

		graph[4].add(new Edge(4, 3));

		graph[4].add(new Edge(4, 5));

		graph[5].add(new Edge(5, 3));

		graph[5].add(new Edge(5, 4));

		graph[5].add(new Edge(5, 6));

		graph[5].add(new Edge(6, 5));

	}
        //printing graph
	static void print(List<Edge> graph[]) {
		for (int i = 0; i < graph.length; i ++) {
			for (int j = 0; j < graph[i].size(); j++) {
				System.out.print("[src is ‐> " + graph[i].get(j).src + " dest is -> " + graph[i].get(j).dest + "]");
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
