public class CheckIfTwoTreesAreMirror {
    static boolean isMirror(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null) 
            return false;
        
        if (root1.data != root2.data) 
            return false;
        return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
    }

    public static void main(String[] args) {
        //             10
        //     20              30
        // 40      50     60         70
        Node root1 = new Node(10);
        root1.left = new Node(20);
        root1.right = new Node(30);
        root1.left.left = new Node(40);
        root1.left.right = new Node(50);
        root1.right.left = new Node(60);
        root1.right.right = new Node(70);
        root1.right.left.left = new Node(80);

        // Node root2 = new Node(10);
        // root2.left = new Node(20);
        // root2.right = new Node(30);
        // root2.left.left = new Node(40);
        // root2.left.right = new Node(50);
        // root2.right.left = new Node(60);
        // root2.right.left.left = new Node(80);
        // root2.right.right = new Node(70);

        Node root2 = new Node(10);
        root2.left = new Node(30);
        root2.right = new Node(20);
        root2.left.left = new Node(70);
        root2.left.right = new Node(60);
        root2.right.left = new Node(50);
        root2.right.right = new Node(40);
        root2.left.right.right = new Node(80);

        if (isMirror(root1, root2))
            System.out.println("Mirror");
        else
            System.out.println("Not Mirror");
    }
}
