class MNode {
    int data;
    MNode left;
    MNode right;
    MNode parent;
    MNode(int x) {
        data = x;
        left = right = parent = null;
    }
}

public class InorderSuccBST {
    MNode root;
    static MNode head;
    MNode minValue(MNode MNode) {
        MNode current = MNode;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    MNode inorderSucc(MNode root, MNode n) {
        if (n.right != null) 
            return minValue(n.right);
 
        MNode p = n.parent;
        while (p != null && n == p.right) {
            n = p;
            p = p.parent;
        }
        return p;
    }
    public static void main(String[] args) {
        InorderSuccBST tree = new InorderSuccBST();
        tree.root = new MNode(20); 
        tree.root.left = new MNode(8); 
        tree.root.right = new MNode(22); 
        tree.root.left.left = new MNode(4); 
        tree.root.left.right = new MNode(12); 
        tree.root.left.right.left = new MNode(10); 
        tree.root.left.right.right = new MNode(14); 
        MNode succ = tree.inorderSucc(tree.root, tree.root.left.right);
        if (succ != null)
            System.out.println("Inorder Successor is: " + succ.data);
        else 
            System.out.println("Successor doesn't exist");
    }
}
