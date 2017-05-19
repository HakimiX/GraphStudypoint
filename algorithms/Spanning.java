
package graphs.algorithms;

import graphs.Edge;
import graphs.Node;
import java.util.ArrayList;
import java.util.List;

public class Spanning {

    public int MinSpanningTree(Node startNode) {
        List<Node> visitedNodes = new ArrayList<>();
        List<Edge> visitedEdges = new ArrayList<>();

        visitedNodes.add(startNode);

        for (int i = 0; i < 3; i++) {
            Edge nodeEdgeWeight = null;
            for (int y = 0; y < visitedNodes.size(); y++) {
                Edge minWeight = null;
                for (Edge edge : visitedNodes.get(y).getFromEdges()) {
                    if (!visitedEdges.contains(edge)) {
                        if (minWeight == null) {
                            minWeight = edge;
                        }
                        if (edge.getWeight() < minWeight.getWeight()) {
                            minWeight = edge;
                        }
                    }
                }

                nodeEdgeWeight = minWeight;
            }
            visitedEdges.add(nodeEdgeWeight);
            visitedNodes.add(nodeEdgeWeight.getEndNode());
        }

        int result = 0;
        for (Edge edge : visitedEdges) {
            System.out.println("weight: " + edge.getWeight());
            result += edge.getWeight();
        }

        return result;
    }
}
