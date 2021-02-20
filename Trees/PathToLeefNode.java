import java.util.Deque;
import java.util.Iterator;
import java.util.ArrayDeque;
public class PathToLeefNode {
    static void pathToLeef(Node root, Deque<Integer> dq) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " : ");
            for (Iterator itr = dq.iterator(); itr.hasNext();)
                System.out.print(itr.next() + " ");
            System.out.println(root.data);
        }

        dq.offerLast(root.data);
        pathToLeef(root.left, dq);
        pathToLeef(root.right, dq);
        dq.pollLast();
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

        Deque<Integer> dq = new ArrayDeque<>();
        pathToLeef(root, dq);
    }
}