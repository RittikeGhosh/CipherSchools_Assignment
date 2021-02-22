import java.util.Scanner;
public class MinCostPath {
    static int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int dp[][] = new int[rows][cols];
        dp[0][0] = grid[0][0];

        for(int j=1;j<cols;j++)
            dp[0][j]=dp[0][j-1]+grid[0][j];
        for(int i=1;i<rows;i++)
            dp[i][0]=dp[i-1][0]+grid[i][0];

        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                dp[i][j] = Math.min(
                    Math.min(dp[i-1][j],dp[i][j-1]), dp[i - 1][j - 1]
                    ) + grid[i][j];
            }
        }
        
        return dp[rows-1][cols-1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt(), col = in.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) 
            for (int j = 0; j < col; j++)
                arr[i][j] = in.nextInt(); 

        System.out.println("Minimum Value Path: " + minPathSum(arr));
        in.close();
    }
}