public class NodesAtKDistance {
    static void printNodesAtKBelow(Node root, int k) {
        if (root == null || k < 0) return;
        if (k == 0) 
            System.out.print(root.data + " ");
        else {
            printNodesAtKBelow(root.left, k - 1);
            printNodesAtKBelow(root.right, k - 1);
        }
    }

    static int nodesAtKDistance(Node root, int target, int k) {
        if (root == null) return -1;
        if (root.data == target) {
            printNodesAtKBelow(root, k);
            return 1;
        }
        int left = nodesAtKDistance(root.left, target, k);
        if (left > -1) {
            if (k == left) System.out.print(root.data + " ");
            else printNodesAtKBelow(root.right, k - left - 1);
            return left + 1;
        }
        int right = nodesAtKDistance(root.right, target, k);
        if (right > -1) {
            if (k == right) System.out.print(root.data + " ");
            else printNodesAtKBelow(root.left, k - right - 1);
            return right + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        //             10
        //     20              30
        // 40      50     60         70
        //             80/
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.right.left.left = new Node(80);

        int target = 80, k = 3;
        nodesAtKDistance(root, target, k);

    }
}
