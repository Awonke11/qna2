import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Traversal<T> {
    HashMap<T, ArrayList<T>> hashMap = new HashMap<>();
    Set<T> visited = new HashSet<>();

    public Traversal(HashMap<T, ArrayList<T>> map) {
        this.hashMap = map;
    }

    public void traverseDirected(T start) {
        Stack<T> stack = new Stack<>();
        stack.add(start);
        visited.add(start);

        while (stack.size() > 0) {
            T current = stack.pop();
            System.out.println(current);

            for (T neighbors : hashMap.get(current)) {
                if (!visited.contains(neighbors)) {
                    stack.add(neighbors);
                }
            }
            ;
        }
    }
}
