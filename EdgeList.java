import java.util.ArrayList;

public class EdgeList<T> {
    private ArrayList<Edge<T>> edgesList = new ArrayList<>();

    public void insertEdge(Edge<T> edge) {
        edgesList.add(edge);
    }

    public ArrayList<Edge<T>> getListOfEdges() {
        ArrayList<Edge<T>> list = new ArrayList<>();
        for (Edge<T> edge : this.edgesList) {
            list.add(edge);
        }
        return list;
    }

    public void getAllEdges() {
        for (Edge<T> e : this.getListOfEdges()) {
            System.out.println(e);
        }
    }
}
