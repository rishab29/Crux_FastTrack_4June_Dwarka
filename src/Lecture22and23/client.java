package Lecture22and23;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");

		graph.addEdge("A", "B", 10);
		graph.addEdge("A", "D", 40);
		graph.addEdge("B", "C", 10);
		graph.addEdge("C", "D", 10);
		graph.addEdge("D", "E", 2);
		graph.addEdge("E", "F", 8);
		graph.addEdge("F", "G", 3);
		graph.addEdge("E", "G", 3);

		System.out.println(graph.numVtces());
		System.out.println(graph.numEdges());
		graph.display();
		
		//graph.removeVertex("A");
//		graph.removeEdge("D", "E");
		graph.display();
		
		System.out.println(graph.hasPath("A","G"));
		graph.bft();
		System.out.println();
		graph.dft();
		System.out.println();
		System.out.println(graph.isConnected());
		
		graph.Dijkstras("E");
		Graph mst=graph.primsAlgo();
		mst.display();

	}

}
