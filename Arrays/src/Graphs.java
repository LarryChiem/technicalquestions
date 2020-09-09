import org.w3c.dom.Node;

import java.util.Queue;
import java.util.*;

public class Graphs {
    private int n;
    private LinkedList<Integer> adjList[];
    private Queue<Integer> q = new LinkedList<>();

    public void makeGraph(int no) {
        n = no;
        adjList = new LinkedList[no];

        int i;
        for (i = 0; i < no; i++) {
            adjList[i] = new LinkedList();
        }
    }

    public void addEdgeToGraph(int u, int v) {
        adjList[u].add(v);
    }



    public static void dfsPrint(Node start) {
        Stack<Node> stack = new Stack<>();
        Set<Node> seen = new HashSet<>();
        stack.push(start); //Add "start" to the search

        while(!stack.isEmpty()) {
            Node curr = stack.pop();
            if (!seen.contains(curr)) {
                seen.add(curr);
                System.out.println(curr);
            }
            while (curr.getNextSibling() != null) {
                if(!seen.contains(curr.getNextSibling())) {
                    stack.push(curr.getNextSibling());
                }
            }
        }
    }

    public static void bfsPrint(Node start) {
        Queue<Node> queue = new LinkedList<>();
        Set<Node> seen = new HashSet<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (!seen.contains(curr)) {
                seen.add(curr);
                System.out.println(curr);
            }
        }

    }

    // Complete the roadsAndLibraries function below.
    static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
        return 1;

    }
}
