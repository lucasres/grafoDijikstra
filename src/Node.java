import java.util.List;
import java.util.ArrayList;

public class Node implements Comparable<Node> {
	private String name;
	private int estimate;
	private List<Edge> edges = new ArrayList<Edge>();
	
	/*
	 * Constructor of the class
	 * @parm String pName
	*/
	public Node(String pName){
		this.name = pName;
	}
	
	/**
	 * get all nodes children
	 * @return List<Node>
	 */
	public List<Node> getChildren(){
		List<Node> nodes = new ArrayList<Node>();
		for(Edge e: this.edges) {
			nodes.add(e.getDestiny());
		}
		return nodes;
	}
	
	public Edge getEdge(int i) {
		return this.edges.get(i);
	}
	
	
	/*
	 * Get all egde
	 * @return String
	*/
	public String getEdges(){
		String out = this.name + " =>";
		
		for(Edge ed : this.edges) {
			out = out + " " + ed.getDestiny().getName() + " , ";
		}
		
		return out;
	}
	
	/*
	 * Add egde 
	 * @return Boolean
	*/
	public boolean addEdge(Node pDestiny,int pWeigth){
		//addInDestiny(this, pDestiny);
		return edges.add(new Edge(this,pDestiny,pWeigth));
		
	}
	
	/**
	 * Build edge in destiny to source
	 * @param source
	 * @param destiny
	 */
	public void addInDestiny(Node source,Node destiny,int pWeigth) {
		destiny.edges.add(new Edge(destiny, source, pWeigth));
	}
	
	/*
	 * Get name of the edge
	 * @return String 
	*/
	public String getName(){
		return this.name;
	}
	
	/**
	 * get grau of the node
	 * @return
	 */
	public int getGr4u() {
		return this.edges.size();
	}
	
	

	public int compareTo(Node other) {
		// TODO Auto-generated method stub
		int last = this.name.compareTo(other.getName());
        return last == 0 ? this.name.compareTo(other.getName()) : last;
	}
	
	
	public int getEstimate() {
		return this.estimate;
	}
	
	public void setEstimate(int e) {
		this.estimate = e;
	}
}
