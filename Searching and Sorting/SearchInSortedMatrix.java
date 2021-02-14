import java.util.Scanner;
public class SearchInSortedMatrix {

    private static void findElement(int arr[][], int val) {
        int i = 0, j = arr[0].length - 1;
        while (i < arr[0].length && j >= 0) {
            if (arr[i][j] == val) {
                System.out.println("Found " + val + " at: " + i + ", " + j);
                return;
            }
            if (arr[i][j] < val)
                i++;
            else j--;
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = in.nextInt();
        
        int val = in.nextInt();

        findElement(arr, val);
    }
}
