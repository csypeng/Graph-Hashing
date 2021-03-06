/**
 * 
 */
package util;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author riesen
 *
 */
public class Node {
	
	/** the identifier of the node */
	private String nodeID; 

	/** the attributes of the node*/
	private Hashtable<String, String> attributes;
	
	/** the edges adjacent with this node */
	private LinkedList<Edge> edges;
	
	/** the centrality measures */
    private double centralityMeasure;

	
	/**
	 * Constructors
	 */
	public Node() {
		this.attributes = new Hashtable<String, String>();
		this.edges = new LinkedList<Edge>();
	}
	public Node(String id) {
		this.nodeID = id;
	}
	
	/** 
	 * generates a printable string of the node
	 */
	public String toString(){
		String node = "NodeID = "+this.nodeID +"\n";
		node += this.attributes;
		return node;
	}
	
	
	/**
	 * puts a new attribute (key,value pair)
	 * in the attribute-table
	 */
	public void put(String key, String value){
		this.attributes.put(key, value);
	}
	
	/**
	 * @return the attribute-value of
	 * @param key
	 */
	public String getValue(String key){
		return this.attributes.get(key);
	}
	


	/**
	 * some getters and setters
	 */

	public String getNodeID() {
		return nodeID;
	}

	public void setNodeID(String nodeID) {
		this.nodeID = nodeID;
	}
	
	public LinkedList<Edge> getEdges() {
		return edges;
	}

	public void setEdges(LinkedList<Edge> edges) {
		this.edges = edges;
	}
        
   
	public void setCentrality(double score) {
		this.centralityMeasure = score;
	}
	

	public double getCentralityMeasure() {
		return this.centralityMeasure;
	}
}
