
public class Main {
	public static void main(String[] args){
		
		Node noS = new Node("S");
		Node noU = new Node("U");
		Node noV = new Node("V");
		Node noX = new Node("X");
		Node noY = new Node("Y");
		
		

		noS.addEdge(noU, 10);
		noS.addEdge(noX, 5);
		
		noU.addEdge(noX, 3);
		noU.addEdge(noV, 1);
		
		noV.addEdge(noY, 6);
		
		noY.addEdge(noV, 4);
		noY.addEdge(noS, 7);
		
		noX.addEdge(noY, 2);
		noX.addEdge(noU, 2);
		
		

		Graph g = new Graph();
		g.addNode(noS);
		g.addNode(noU);
		g.addNode(noX);
		g.addNode(noV);
		g.addNode(noY);
		
		
		
		
		g.dijkstra(noS);


		/*
		
		Node noA = new Node("A");
		Node noB = new Node("B");
		Node noC = new Node("C");
		Node noD = new Node("D");
		Node noE = new Node("E");
		
		noA.addEdge(noE, 10);
		noA.addEdge(noB, 50);
		noA.addEdge(noD, 100);
		noA.addEdge(noC, 30);
		
		noC.addEdge(noB, 5);
		noC.addEdge(noD, 50);
		
		noD.addEdge(noB, 20);
		
		noE.addEdge(noD, 10);
		
		Graph g = new Graph();
		g.addNode(noA);
		g.addNode(noB);
		g.addNode(noC);
		g.addNode(noD);
		g.addNode(noE);
		
		g.dijkstra(noA);
		
		*/
		
		
		
		
	}
}
