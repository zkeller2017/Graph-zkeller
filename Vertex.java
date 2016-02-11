import java.util.ArrayList;
public class Vertex<E>
{
	private ArrayList<Edge<E>> vertices;
	private E value;
	private boolean visited;
	
	public Vertex(E contains)
	{
		value = contains;
		vertices = new ArrayList<Edge<E>>();
		visited = false;
	}
	
	public Vertex()
	{
		vertices = new ArrayList<Edge<E>>();
		visited = false;
	}
	
	public void addEdge(Vertex<E> v, Integer weight)
	{
		vertices.add(new Edge<E>(v, weight));
	}
	
	public E Value()
	{
		return value;
	}
	
	public String toString()
	{
		String s = "";
		s  = s + value.toString();
		return s;
	}
	
	public boolean wasVisited()
	{
		return visited;
	}
	
	public void setVisited()
	{
		visited = true;
	}
	
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

