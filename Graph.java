import java.util.ArrayList;
import java.lang.Math;
/**
	This incredibly rudimentary Graph class runs a greedy algorithm on the
	traveling salesman problem. It was made primarily to test the functionality of the 
	vertex and edge classes.
	@author Zachary Keller
	@version final
*/
public class Graph<E>
{
	/**
		The main method creates new vertices and connects them
		all to each other with random weights, then calls the recursive
		run method.
	*/
	public static void main(String[] args)
	{
		Vertex<String> v1 = new Vertex<String>("first");
		Vertex<String> v2 = new Vertex<String>("second");
		Vertex<String> v3 = new Vertex<String>("third");
		Vertex<String> v4 = new Vertex<String>("fourth");
		
		ArrayList<Vertex> vertices = new ArrayList<Vertex>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		
		int weight = 0;
		for (int i = 0; i < vertices.size(); i++)
		{
			for (int k = 0; k < vertices.size(); k++)
			{
				if (vertices.get(i).Value() != vertices.get(k).Value())
				{
					vertices.get(i).addEdge(vertices.get(k),weight);
					weight = (int) (Math.random() * 10);
				}
			}
		}
		
		run(v1);

	}
	/**
		This method travels through all the vertices until it hits a vertex that it has
		already visited. This is the basic greedy solution to the traveling salesman problem.
	*/
	public static void run(Vertex<String> v)
	{
		if (v.wasVisited())
		{
			System.out.println("end: " + v);
		}
		else
		{
			System.out.println("now at: " + v);
			v.setVisited();
			run(v.findBest());
		}
	}
}