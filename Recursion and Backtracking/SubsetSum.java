import java.util.Scanner;
public class SubsetSum {
    static void genSubsetForSum(int arr[], int n, int k, String res) {
        // base case
        if (k == 0) {
            StringBuilder new_s = new StringBuilder();
            System.out.println(new_s.append(res.trim()).reverse());
            return;
        } 
        if (n == 0) return;

        genSubsetForSum(arr, n - 1, k, res);
        if (k - arr[n - 1] >= 0)
            genSubsetForSum(arr, n - 1, k - arr[n - 1], res + arr[n - 1] + " ");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int k = in.nextInt();

        genSubsetForSum(arr, n, k, "");
    }
}
