public class MaxSubtreeSum {
    static int res = Integer.MIN_VALUE;
    static int maxSum(Node root) {
        if (root == null) return 0;
        int left = maxSum(root.left);
        int right = maxSum(root.right);

        res = Math.max(res, left + right + root.data);
        return left + right + root.data;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(-2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(-6);
        root.right.right = new Node(2);

        maxSum(root);
        System.out.println(res);
    }
}
