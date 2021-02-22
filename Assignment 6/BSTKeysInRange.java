public class BSTKeysInRange {
    Node root = null;
    void printKeys(Node root, int l, int r) {
        if (root == null) return;
        if (l < root.data) 
            printKeys(root.left, l, r);
        if (l <= root.data && r >= root.data)
            System.out.println(root.data + " ");
        if (r > root.data)
            printKeys(root.right, l, r);
    }
    public static void main(String[] args) {
        BSTKeysInRange tree = new BSTKeysInRange();
        tree.root = new Node(20); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(32); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(12); 
        tree.root.left.right.left = new Node(10); 
        tree.root.left.right.right = new Node(14); 

        tree.printKeys(tree.root, 10, 25);
    }
}
