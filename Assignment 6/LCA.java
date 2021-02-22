public class LCA {
    Node root = null;
    Node lca(Node root, int x, int y) {
        if (root == null) return null;
        if (root.data > x && root.data > y)
            return lca(root.left, x, y);
        if (root.data < x && root.data < y)
            return lca(root.right, x, y);
        return root;
    }
    public static void main(String[] args) {
        LCA tree = new LCA();
        tree.root = new Node(20); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(22); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(12); 
        tree.root.left.right.left = new Node(10); 
        tree.root.left.right.right = new Node(14); 

        int x = 10, y = 14;
        Node node = tree.lca(tree.root, x, y);
        System.out.println("LCA : " + node.data);
    }
}
