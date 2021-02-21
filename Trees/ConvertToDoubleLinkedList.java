public class ConvertToDoubleLinkedList {
    static Node prev = null, head = null;
    static void toDLL(Node root) {
        if (root == null) return;
        toDLL(root.left);
        if (head == null)
            head = root;
        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        toDLL(root.right);
    }

    static void traverse(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.right;
        }
        System.out.println();
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
        root.right.right = new Node(70);

        toDLL(root);
        traverse(head);

    }
    
}
