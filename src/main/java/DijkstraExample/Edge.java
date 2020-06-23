/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DijkstraExample;

//This class is pretty self explanatory. Has weight, points to a start and target node.
public class Edge 
{
    private double weight;
    private Node startnode;
    private Node targetnode;
	
    public Edge(double weight, Node startnode, Node targetnode) 
    {
    	this.weight = weight;
	this.startnode = startnode;
	this.targetnode = targetnode;
    }
 
    public double getWeight() 
    {
	return weight;
    }
 
    public void setWeight(double weight) 
    {
	this.weight = weight;
    }
 
    public Node getStartnode() 
    {
	return startnode;
    }
 
    public void setStartnode(Node startnode) 
    {
	this.startnode = startnode;
    }
 
    public Node getTargetnode() 
    {
	return targetnode;
    }
 
    public void setTargetnode(Node targetnode) 
    {
	this.targetnode = targetnode;
    }
}