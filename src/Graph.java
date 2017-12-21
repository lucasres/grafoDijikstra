import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.HashMap;


public class Graph  {
	private List<Node> nodes = new ArrayList<Node>();
	
	/**
	 * Add node in the list of node
	 * @param node
	 */
	public void addNode(Node node) {
		nodes.add(node);
	}
	
	/**
	 * Search in the list and return Node
	 * @param name
	 * @return
	 */
	public Node getNode(String name) {
		int i = 0;
		for(Node n:this.nodes) {
			if(n.getName().equals(name)) {
				return this.nodes.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Print the list of Adj
	 */
	public void printListAdj() {
		for(Node n:this.nodes) {
			System.out.println(n.getEdges());
		}
	}
	
	/**
	 * get grau of graph
	 */
	public void getGr4u() {
		List<Integer> graus = new ArrayList<Integer>();
		for(Node n:this.nodes) {
			graus.add(n.getGr4u());
		}
		Collections.sort(graus);
		
		for(Integer i:graus) {
			System.out.print(i+",");
		}
		System.out.println("");
	}
	
	public int getHeigth(Node node, int heigth) {
		if(node.getChildren().isEmpty()) {
			return heigth;
		} else {
			List<Integer> aux = new ArrayList<Integer>();
			for(Node n : node.getChildren()) {
				aux.add(getHeigth(n, heigth+1));
			}
			return Collections.max(aux);
		}
	}
	
	public void searchWidth(Node root){
		List<Node> aux = new ArrayList<Node>();
		int count = 0;
		String rs = "";
		
		//setando a raiz
		aux.add(root);
		
		while(count < aux.size()){
			List<Node> children = aux.get(count).getChildren();
			for(Node n : children){
				aux.add(n);
			}
			rs += aux.get(count).getName() + ", ";
			count++;
		}
		
		System.out.println(rs);
	}
	
	public void searchDeep(Node root){
		System.out.println(root.getName());
		for(Node n : root.getChildren()){
			searchDeep(n);
		}
	}
	
	
	
	// Algoritmo de Dijkstra
	public void dijkstra(Node root) {
		Map<Node,Integer> distance = new HashMap<Node, Integer>();
		List<Node> notChecked = new  ArrayList<Node>();
		int j = 0;
		
		this.nodes.get(0).setEstimate(0);
		notChecked.add(root);
		

		for(int i = 0;i < this.nodes.size();i++) {
			if(!(this.nodes.get(i).getName()==root.getName())) {
				this.nodes.get(i).setEstimate(9999);
				notChecked.add(this.nodes.get(i));
			}
		}
		
		Collections.sort(notChecked);
		
		
		for(int i = 0;i< notChecked.size();i++) {
			j=0;
			System.out.println("Atual " + notChecked.get(i).getName());
			for(Node n : notChecked.get(i).getChildren()) {
				System.out.print("Vizinho " + n.getName() + " ");
				if(i==0) {
					System.out.println("Peso " + notChecked.get(i).getEdge(j).getWeigth());
					int atual = notChecked.get(i).getEdge(j).getWeigth();
					if(atual < n.getEstimate()) {
						n.setEstimate(atual);
						distance.put(n, n.getEstimate());
					}
				} else {
					int atual = notChecked.get(i).getEstimate()+notChecked.get(i).getEdge(j).getWeigth();
					
					if(atual < n.getEstimate()) {
						n.setEstimate(atual);
						distance.put(n, n.getEstimate());
					}
					System.out.println("Peso " + n.getEstimate());
				}
				j++;
			}
		}
		
		
		for (Map.Entry<Node, Integer> entry : distance.entrySet())
		{
		    System.out.println(entry.getKey().getName() + "/" + entry.getValue());
		}
		
		
	}
	
	
	
	
}
