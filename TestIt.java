/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import graphs.algorithms.BreadthFirst;
import graphs.simpleimpl.GraphBuilderImpl;
import graphs.algorithms.Circle;
import graphs.algorithms.Spanning;

/**
 *
 * @author Tobias
 */
public class TestIt
{
    public static void main(String[] args)
    {
        GraphBuilder gb = new GraphBuilderImpl();
        
        BuildNode a = gb.createNode("A");
        BuildNode b = gb.createNode("B");
        BuildNode c = gb.createNode("C");
        BuildNode d = gb.createNode("D");
        BuildNode e = gb.createNode("E");
        
        gb.createEdge(a, b, 10);
        gb.createEdge(b, a, 20);
        gb.createEdge(a, d, 5);
        gb.createEdge(d, a, 2);
//        gb.createEdge(b, c);
//        gb.createEdge(c, d);
//        gb.createEdge(c, c);
//        gb.createEdge(c, e);
//        gb.createEdge(e, d);
        
        Graph g = gb.build();
//      Iterable<Node> res = BreadthFirst.runBreadthFirst(g.findNode("A"));
//      Iterable<Node> res = Circle.hasCycle(g); 
//      int res = new MinSpanningTree().MinSpanningTree(g.findNode("A"));

//        for(Node n : res)
//        {
//            System.out.println(n.getName());
//        }
    }
}
