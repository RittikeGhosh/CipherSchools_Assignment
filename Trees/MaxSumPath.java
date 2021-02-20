public class MaxSumPath {
    static int res = 0;
    static int maxSum(Node root) {
        if (root == null) return 0;
        int left = maxSum(root.left);
        int right = maxSum(root.right);

        res = Math.max(res, root.data + left + right);
        return Math.max(0, root.data + Math.max(left, right));
    }
    public static void main(String[] args) {
        // //             10
        // //     20              30
        // // 40      50     60         70
        // Node root = new Node(10);
        // root.left = new Node(20);
        // root.right = new Node(30);
        // root.left.left = new Node(40);
        // root.left.right = new Node(50);
        // root.right.left = new Node(60);
        // root.right.left.left = new Node(80);
        // root.right.right = new Node(70);

        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        // Node root = new Node(2);
        // root.left = new Node(-1);

        // Node root = new Node(1);
        // root.left = new Node(-2);
        // root.right = new Node(3);

        maxSum(root);
        System.out.println(res);
    }
}
