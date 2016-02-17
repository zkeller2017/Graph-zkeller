import java.util.ArrayList;
/**
	The vertex class contains a value that is stored in the graph, along
	withe a list of all the vertices that it is connected to. It contains these other
	vertices in an array of type Edge, which has the other vertex and the weight in it.
	@author Zachary Keller
	@version final
*/
public class Vertex<E>
{
	/**
		Contains edges that connect this vertex to the other vertices it is connected to
		in the graph
	*/
	private ArrayList<Edge<E>> vertices;
	
	/**
		The value that this vertex holds
	*/
	private E value;
	
	/**
		whether or not this vertex has been visited by the graph
	*/
	private boolean visited;
	
	/**
		Constructor- takes in a value that is assigned to this Vertex
		@param contains The value that is assigned to this vertex
	*/
	public Vertex(E contains)
	{
		value = contains;
		vertices = new ArrayList<Edge<E>>();
		visited = false;
	}
	
	/**
		Constructor-  creates a new vertex but does not assign it a value
	*/
	public Vertex()
	{
		vertices = new ArrayList<Edge<E>>();
		visited = false;
	}
	
	/**
		Connects this vertex to another vertex by adding another edge to the list of connected vertices
		@param v A new vertex to connect this one to
		@param weight The value of weight between the two vertices
	*/
	public void addEdge(Vertex<E> v, Integer weight)
	{
		vertices.add(new Edge<E>(v, weight));
	}
	
	/**
		Returns the value contained by this vertex
		@return The value contained by this vertex
	*/
	public E Value()
	{
		return value;
	}
	
	/**
		Returns a string representation of this vertex with the value it contains
		@return A string representation of this vertex
	*/
	public String toString()
	{
		String s = "";
		s  = s + value.toString();
		return s;
	}
	
	/**
		returns whether or not this vertex was visited by the graph
		@return whether or not this vertex was visited by the graph
	*/
	public boolean wasVisited()
	{
		return visited;
	}
	
	/**
		Changes the status of whether or not this vertex has been visited by the graph
	*/
	public void setVisited()
	{
		visited = true;
	}
	
	/**
		Finds the vertex that is connected to this vertex with the least weight in between them. It does
		not return a vertex that has already been visited
		@return The Vertex with the least weight
	*/
	public Vertex findBest()
	{
		int least = Integer.MAX_VALUE;
		Vertex<E> leastVertex = this;
		for (int i = 0; i < vertices.size(); i++)
		{
			//System.out.println(vertices.get(i).Vertex() + ": " + vertices.get(i).getWeight());
			if (vertices.get(i).getWeight() < least && vertices.get(i).Vertex().wasVisited() == false)
			{
				least = vertices.get(i).getWeight();
				leastVertex = vertices.get(i).Vertex();
			}
		}
		//System.out.println("best: " + leastVertex);
		return leastVertex;
		
	}
}

