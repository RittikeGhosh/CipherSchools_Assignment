public class CheckBST {
    static boolean isBST(Node root, int min, int max) {
        if (root == null) return true;
        if (root.data < min || root.data > max) 
            return false;
        return isBST(root.left, min, root.data - 1) && 
            isBST(root.right, root.data + 1, max);
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);

        if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) 
            System.out.println("BST");
        else
            System.out.println("not BST");
    }
}
