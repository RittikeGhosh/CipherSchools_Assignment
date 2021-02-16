import java.util.Scanner;
import java.util.ArrayList;
public class RatInMaze {
    public static void generate(int[][] arr, int n, int m, String s, ArrayList<String> res) {
        if ((n < 0 || n >= arr.length) || 
            (m < 0 || m >= arr[0].length))
                return;
        if (arr[n][m] == 0) return;
        
        if (n == arr.length - 1 && m == arr[0].length - 1) {
            res.add(s);
            return;
        }
        arr[n][m] = 0;
        generate(arr, n + 1, m, s + "D", res);
        generate(arr, n, m - 1, s + "L", res);
        generate(arr, n, m + 1, s + "R", res);
        generate(arr, n - 1, m, s + "U", res);
        arr[n][m] = 1;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> res = new ArrayList<>();
        generate(m, 0, 0, "", res);
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][]arr = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = in.nextInt();
        ArrayList<String> res = findPath(arr, n);
        for (String s : res) 
            System.out.print(s + " ");

    }
}
