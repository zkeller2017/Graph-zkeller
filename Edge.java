/**
	The Edge class contains a weight and vertex. It is used by the Vertex Class
	in the list of all the vertices one vertex is connected to
	@author Zachary Keller
	@version final
*/
public class Edge<E>
{
	/**
		The vertex stored in this edge
	*/
	private Vertex<E> vertex;
	
	/**
		The weight between the vertex stored in this edge and whatever vertex is using this edge
	*/
	private Integer weight;
	
	/**
		Constructor- sets the vertex and weight
		@param v The vertex
		@param diff the weight
	*/
	public Edge(Vertex<E> v, Integer diff)
	{
		vertex = v;
		weight = diff;
		
	}
	
	/**
		Returns the Vertex stored in this edge
		@return the vertex
	*/
	public Vertex<E> Vertex()
	{
		return vertex;
		
	}
	
	/**
		Returns the weight between the two vertices
		@return The Weight
	*/
	public Integer getWeight()
	{
		return weight;
	}
	
	
	
	
	
}