Def=>"A graph is a non-linear data structure consisting of vertices and edges, 
	where vertices represent objects and edges represent relationships or connections between them.
	Graphs can be directed or undirected, weighted or unweighted, connected or disconnected. 
	Common graph representations are adjacency matrix and adjacency list, and the two major traversal techniques are BFS and DFS."

import java.util.*;

public class graph {
	private HashMap<String,ArrayList<String>>adjlist= new HashMap<>();
	
	public void printGraph() {
		
		System.out.print(adjlist);
		
	}
//	using arraylist
	
//	AddVertex Method
	
	public boolean addVetex(String vertex) {
		if(adjlist.get(vertex)==null) {
			adjlist.put(vertex,new ArrayList<String>());
			return true;
		}
		return false;
		
	}
	
//	Add Edge method....	
	
	public boolean addEdge(String vertex1,String vertex2) {
		if(adjlist.get(vertex1)!=null && adjlist.get(vertex2)!=null) {
		adjlist.get(vertex1).add(vertex2);
		adjlist.get(vertex2).add(vertex1);
		return true;
	  } 
		return false;
	}
	

	
//	Remove Edge method
	
	public boolean removeEdge(String vertex1,String vertex2) {
		if(adjlist.get(vertex1)!=null && adjlist.get(vertex2)!=null) {
			adjlist.get(vertex1).remove(vertex2);
			adjlist.get(vertex2).remove(vertex1);
			return true;
		  } 
			return false;
		}
	
	
//		Remove Vertex
	
public boolean removeVertex(String vertex) {
	if(adjlist.get(vertex)==null) return false;
	for(String othervertex :adjlist.get(vertex)) {
		adjlist.get(othervertex).remove(vertex);
	}
	adjlist.remove(vertex);
	return true;
}
// Main class
	public static void main(String[] args) {
		graph mygraph= new graph();
		mygraph.addVetex("A");
		mygraph.addVetex("B");
		mygraph.addVetex("C");
		mygraph.addVetex("D");
		
		mygraph.addEdge("A","B");
		mygraph.addEdge("A","C");
		mygraph.addEdge("A","D");
		mygraph.addEdge("B","D");
		mygraph.addEdge("C","D");
	
		
		//mygraph.removeEdge("A", "B");
		mygraph.removeVertex("D");
		
		mygraph.printGraph();
	}

}
