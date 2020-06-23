/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DijkstraExample;

/**
 *
 * @author louis
 */
public class Main 
{
    public static void main(String[] args) 
    {
        //Ok, this is the main. This first part is me setting up the nodes on the graph.
	Node nodeA = new Node("A");
	Node nodeB = new Node("B");
	Node nodeC = new Node("C");
	Node nodeD = new Node("D");
	Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");
        
        //Here are the edges.......
	nodeA.addNeighbour(new Edge(4,nodeA,nodeB));
	nodeA.addNeighbour(new Edge(2,nodeA,nodeC));
	nodeB.addNeighbour(new Edge(3,nodeB,nodeC));
	nodeB.addNeighbour(new Edge(7,nodeB,nodeD));
	nodeB.addNeighbour(new Edge(4,nodeB,nodeE));
	nodeC.addNeighbour(new Edge(3,nodeC,nodeD));
	nodeD.addNeighbour(new Edge(1,nodeD,nodeE));
        nodeD.addNeighbour(new Edge(2,nodeD,nodeF));
        nodeE.addNeighbour(new Edge(5,nodeE,nodeF));
        nodeE.addNeighbour(new Edge(7,nodeE,nodeG));
        nodeF.addNeighbour(new Edge(5,nodeF,nodeG));
        
        //Then here I make an instance of the Dijkstra algorithm class and compute the shortest paths to each node from node A.
	DijkstraShortestPath shortestPath = new DijkstraShortestPath();
	shortestPath.computeShortestPaths(nodeA);
	
        //Then, we print out all the wonderful data we compiled with some nice lines to make it look pretty.
        System.out.println("--------------------------------------");
	System.out.println("Calculating minimum distance");
	System.out.println("--------------------------------------");
	
	System.out.println("Minimum distance from A to B: "+nodeB.getDistance());
	System.out.println("Minimum distance from A to C: "+nodeC.getDistance());
	System.out.println("Minimum distance from A to D: "+nodeD.getDistance());
	System.out.println("Minimum distance from A to E: "+nodeE.getDistance());
        System.out.println("Minimum distance from A to F: "+nodeF.getDistance());
        System.out.println("Minimum distance from A to G: "+nodeG.getDistance());
		
	System.out.println("--------------------------------------");
	System.out.println("Calculating Paths");
	System.out.println("--------------------------------------");
	
        //This part uses the extra function in the Dijkstra class, getShortestPath, to return the progression of nodes that we stored in the arraylist.
	System.out.println("Shortest Path from A to B: "+shortestPath.getShortestPathTo(nodeB));
	System.out.println("Shortest Path from A to C: "+shortestPath.getShortestPathTo(nodeC));
	System.out.println("Shortest Path from A to D: "+shortestPath.getShortestPathTo(nodeD));
	System.out.println("Shortest Path from A to E: "+shortestPath.getShortestPathTo(nodeE));
        System.out.println("Shortest Path from A to F: "+shortestPath.getShortestPathTo(nodeF));
        System.out.println("Shortest Path from A to G: "+shortestPath.getShortestPathTo(nodeG));	
        
        //And that's it!
    }   
}
