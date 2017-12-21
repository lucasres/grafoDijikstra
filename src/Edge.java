public class Edge {
	private Node source;
	private Node destiny;
	private int weight;
	
	/*
	 * Constructor of the class
	 * @parm Node Source of edge
	 * @parm Node Destiny of edge
	 */
	public Edge(Node pSource, Node pDestiny, int pWeight){
		this.source = pSource;
		this.destiny = pDestiny;
		this.weight = pWeight;
	}
	
	/*
	 * Get Source of the edge
	 * @return Node 
	*/
	public Node getSource(){
		return this.source;
	}
	
	/*
	 * Get Destiny of the edge
	 * @return Node 
	*/
	public Node getDestiny(){
		return this.destiny;
	}
	
	/*
	 * Get Destiny of the edge
	 * @return Node 
	*/
	public int getWeigth(){
		return this.weight;
	}
	
	/*
	 * Set Source of the edge
	*/
	public void setSource(Node pSource){
		this.source = pSource;
	}
	
	/*
	 * Set Destiny of the edge
	*/
	public void setDestiny(Node pDestiny){
		this.destiny = pDestiny;
	}
	
	/*
	 * Set Destiny of the edge
	*/
	public void setWeigth(int pWeigth){
		this.weight = pWeigth;
	}
}
