package codePractice;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class CloneGraph {


    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    HashMap<Integer, Node> m = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        if (m.get(node.val) != null) {
            return m.get(node.val);
        }

        Node newnode = new Node(node.val);
        m.put(newnode.val, newnode);

        for (Node n1 : node.neighbors) {
            m.get(newnode.val).neighbors.add(cloneGraph(n1));
        }

        return newnode;

    }


    public static void main(String[] args) {
    }
}