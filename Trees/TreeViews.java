import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class TreeViews {
    static int max_depth = 0;
    static Map<Integer, Integer> mp = new TreeMap<>();
    static void leftView(Node root, int depth) {
        if (root == null) return;
        if (depth > max_depth) 
            System.out.print(root.data + " ");
        leftView(root.left, depth + 1);
        leftView(root.right, depth + 1);
        max_depth = Math.max(depth, max_depth);
    }

    static void rightView(Node root, int depth) {
        if (root == null) return;
        if (depth > max_depth) 
            System.out.print(root.data + " ");
        rightView(root.right, depth + 1);
        rightView(root.left, depth + 1);
        max_depth = Math.max(depth, max_depth);
    }

    static void topView(Node root, int depth, HashSet<Integer> vis) {
        if (root == null) return;
        if (!vis.contains(depth)) {
            System.out.print(root.data + " ");
            vis.add(depth);
        }
        topView(root.left, depth - 1, vis);
        topView(root.right, depth + 1, vis);
    }

    static void bottomView(Node root, int depth, Map<Integer, Integer> vis) {
        if (root == null) return;
        vis.put(depth, root.data);
        bottomView(root.left, depth - 1, vis);
        bottomView(root.right, depth + 1, vis);
    }
    public static void main(String[] args) {
        //             10
        //     20              30
        // 40      50     60         70
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.left.left = new Node(80);
        root.right.right = new Node(70);

        System.out.print("Left View: ");
        leftView(root, 1);

        max_depth = 0;
        System.out.print("\nRight View: ");
        rightView(root, 1);

        System.out.print("\nTop View: ");
        topView(root, 0, new HashSet<Integer>());

        System.out.print("\nBottom View: ");
        bottomView(root, 0, mp);
        for (Map.Entry<Integer, Integer> e : mp.entrySet())
            System.out.print(e.getValue() + " ");
        System.out.println();
    }
}
