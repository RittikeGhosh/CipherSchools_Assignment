public class LCA {
    static Node lca2(Node root, int x, int y) {
        if (root == null) return null;
        if (root.data == x || root.data == y)
            return root;
 
        Node left  = lca2(root.left, x, y);
        Node right = lca2(root.right, x, y);
 
        if (left != null && right !=null)
            return root;
 
        return (left != null) ? left : right;
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

        System.out.println(lca2(root, 20, 30).data);
    }
}