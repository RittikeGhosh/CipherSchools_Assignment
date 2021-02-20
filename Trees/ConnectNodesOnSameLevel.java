import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodesOnSameLevel {
    static class Node {
        int data;
        Node left, right, nextRight;
        Node(int x) {
            data = x;
            left = right = nextRight = null;
        }
    }
    static void connect(ConnectNodesOnSameLevel.Node root) {
        Queue<ConnectNodesOnSameLevel.Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty() && q.peek() != null) {
            ConnectNodesOnSameLevel.Node temp = q.poll(), prev = temp;
            while (temp != null) {
                if (temp.left != null) 
                    q.offer(temp.left);
                if (temp.right != null) 
                    q.offer(temp.right);
                temp = q.poll();
                prev.nextRight = temp;
                prev = temp;
            }
            q.offer(null);
        }
    }

    static void traverse(ConnectNodesOnSameLevel.Node root) {
        while (root != null) {
            System.out.print(root.data + " ");
            root = root.nextRight;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //             10
        //     20              30
        // 40      50     60         70
        ConnectNodesOnSameLevel.Node root = new ConnectNodesOnSameLevel.Node(10);
        root.left = new ConnectNodesOnSameLevel.Node(20);
        root.right = new ConnectNodesOnSameLevel.Node(30);
        root.left.left = new ConnectNodesOnSameLevel.Node(40);
        root.left.right = new ConnectNodesOnSameLevel.Node(50);
        root.right.left = new ConnectNodesOnSameLevel.Node(60);
        root.right.left.left = new ConnectNodesOnSameLevel.Node(80);
        root.right.right = new ConnectNodesOnSameLevel.Node(70);

        connect(root);
        traverse(root.left.left);
    }
}
