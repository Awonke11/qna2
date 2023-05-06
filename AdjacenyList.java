import java.util.ArrayList;
import java.util.HashMap;

public class AdjacenyList<T> {
    EdgeList<T> edgeList;

    public AdjacenyList(EdgeList<T> edgeList) {
        this.edgeList = edgeList;
    }

    public HashMap<T, ArrayList<T>> getAdjacencyListDirected() {
        HashMap<T, ArrayList<T>> hashMap = new HashMap<>();

        for (Edge<T> edge : edgeList.getListOfEdges()) {
            if (!hashMap.containsKey(edge.getStart())) {
                hashMap.put(edge.getStart(), new ArrayList<T>());
            }
            if (!hashMap.containsKey(edge.getEnd()) && edge.getEnd() != null) {
                hashMap.put(edge.getEnd(), new ArrayList<T>());
            }
            if (edge.getEnd() != null) {
                hashMap.get(edge.getStart()).add(edge.getEnd());
            }
        }

        return hashMap;
    }

    public HashMap<T, ArrayList<T>> getAdjacencyListUnDirected() {
        HashMap<T, ArrayList<T>> hashMap = new HashMap<>();

        for (Edge<T> edge : edgeList.getListOfEdges()) {
            if (!hashMap.containsKey(edge.getStart())) {
                hashMap.put(edge.getStart(), new ArrayList<T>());
            }
            if (!hashMap.containsKey(edge.getEnd()) && edge.getEnd() != null) {
                hashMap.put(edge.getEnd(), new ArrayList<T>());
            }
            if (edge.getEnd() != null) {
                hashMap.get(edge.getStart()).add(edge.getEnd());
                hashMap.get(edge.getEnd()).add(edge.getStart());
            }
        }

        return hashMap;
    }

}
