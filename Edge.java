public class Edge<E>
{
	private Vertex<E> vertex;
	private Integer weight;
	
	
	public Vertex<E> Vertex()
	{
		return vertex;
		
	}
	
	public Integer getWeight()
	{
		return weight;
	}
	
	public Edge(Vertex<E> v, Integer diff)
	{
		vertex = v;
		weight = diff;
		
	}
	
	
	
}