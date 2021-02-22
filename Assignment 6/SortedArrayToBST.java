import java.util.Scanner;
public class SortedArrayToBST {
    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    Node sortedArrayToBST(int[] arr, int l, int r) {
        if (l > r) return null;
        int mid = (l + r) / 2;
        Node root = new Node(arr[mid]);
        root.left =  sortedArrayToBST(arr, l, mid - 1);
        root.right = sortedArrayToBST(arr, mid + 1, r);
        return root;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), arr[];
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        SortedArrayToBST tree = new SortedArrayToBST();
        Node root = tree.sortedArrayToBST(arr, 0, arr.length - 1);
        tree.inorder(root);
        in.close();
    }
}
