import java.util.Scanner;
public class TreeFromInorderPreorder {
    static int pre_i = 0;
    static Node constructTree(int in[], int pre[], int in_l, int in_r) {
        if (in_l > in_r || pre_i == pre.length) return null;

        int x = pre[pre_i++], loc = in_l;
        Node root = new Node(x);
        while (loc <= in_r && in[loc] != x) loc++;

        root.left = constructTree(in, pre, in_l, loc - 1);
        root.right = constructTree(in, pre, loc + 1, in_r);

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
        int []preorder = new int[n];
        for (int i = 0; i < n; i++)
            inorder[i] = in.nextInt();
        for (int i = 0; i < n; i++)
            preorder[i] = in.nextInt();
        
        Node root = constructTree(inorder, preorder, 0, n - 1);
        inorderTraverse(root);
        in.close();
    }
    
}
