public class Edge<T> {
    private T start;
    private T end;

    public Edge(T start, T end) {
        this.start = start;
        this.end = end;
    }

    public Edge(T start) {
        this.start = start;
    }

    public Edge() {

    }

    public T getStart() {
        return this.start;
    }

    public T getEnd() {
        return this.end;
    }

    public String toString() {
        return String.format("[%s, %s]", this.getStart(), this.getEnd());
    }
}
