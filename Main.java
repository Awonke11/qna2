import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        EdgeList<String> edge = new EdgeList<>();

        edge.insertEdge(new Edge<String>("a", "b"));
        edge.insertEdge(new Edge<String>("a", "c"));
        edge.insertEdge(new Edge<String>("c", "e"));
        edge.insertEdge(new Edge<String>("b", "d"));
        edge.insertEdge(new Edge<String>("d", "f"));
        edge.insertEdge(new Edge<String>("f"));
        edge.insertEdge(new Edge<String>("e"));

        AdjacenyList<String> adjacenyList = new AdjacenyList<>(edge);
        HashMap<String, ArrayList<String>> hash = adjacenyList.getAdjacencyListDirected();
        Traversal<String> traversal = new Traversal<>(hash);
        traversal.traverseDirected("a");
    }
}