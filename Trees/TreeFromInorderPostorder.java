import java.util.Scanner;
public class TreeFromInorderPostorder {
    static int post_i = 0;
    static Node constructTree(int in[], int post[], int in_l, int in_r) {
        if (in_l > in_r || post_i == -1) return null;

        int x = post[post_i--], loc = in_l;
        Node root = new Node(x);
        while (loc <= in_r && in[loc] != x) loc++;

        root.right = constructTree(in, post, loc + 1, in_r);
        root.left = constructTree(in, post, in_l, loc - 1);

        return root;
    }

    static void inorderTraverse(Node root) {
        if (root == null) return;
        inorderTraverse(root.left);
        System.out.print(root.data + " ");
        inorderTraverse(root.right);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []inorder = new int[n];
        int []post = new int[n];
        for (int i = 0; i < n; i++)
            inorder[i] = in.nextInt();
        for (int i = 0; i < n; i++)
            post[i] = in.nextInt();
        
        post_i = n - 1;
        Node root = constructTree(inorder, post, 0, n - 1);
        inorderTraverse(root);
        System.out.println();
        in.close();
    }
}
