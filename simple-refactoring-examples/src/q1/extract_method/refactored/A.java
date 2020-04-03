package q1.extract_method.refactored;

import java.util.List;


public class A {
   Node m1(List<Node> nodes, String p) {
	   processExtract(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	   processExtract(edgeList, p);
	   // other implementation
      return null;
   }

   <T extends Graph> T processExtract(List<T> nodes, String p)
   {
	   T found = null;
	   for (T node : nodes) {
			if (node.contains(p))
				System.out.println(node);
				found = node;
		}
	return found;
   
   }
}

class Graph 
{
	String name;
	public boolean contains(String p) {
	      return name.contains(p);
	   }

}
class Node extends Graph{

   
}

class Edge extends Graph{
   
}