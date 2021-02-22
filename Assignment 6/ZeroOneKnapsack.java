import java.util.Scanner;
public class ZeroOneKnapsack {
    static int maxValue(int []val, int[] wt, int k) {
        int n = val.length;
        int [][] mem = new int[n + 1][k + 1];
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (i == 0 || j == 0)
                    mem[i][j] = 0;
                else if (wt[i - 1] <= j) 
                    mem[i][j] = Math.max(val[i - 1] + 
                        mem[i - 1][j - wt[i - 1]], mem[i - 1][j]);
                else 
                    mem[i][j] = mem[i - 1][j];
            }
        }

        return mem[n][k];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []val = new int[n], wt = new int[n];
        for (int i = 0; i < n; i++)
            val[i] = in.nextInt();
        for (int i = 0; i < n; i++)
            wt[i] = in.nextInt();
        int k = in.nextInt();
        
        System.out.println("Max Value: " + maxValue(val, wt, k));
        in.close();
    }
}
