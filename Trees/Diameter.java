public class Diameter {
    static int res = 0;
    static int findDiameter(Node root) {
        if (root == null) return 0;
        int left = findDiameter(root.left);
        int right = findDiameter(root.right);

        res = Math.max(res, left + right);
        return 1 + Math.max(left, right);
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

        findDiameter(root);
        System.out.println(res);
    }
}
