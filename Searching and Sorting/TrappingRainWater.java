import java.util.Scanner;
public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = in.nextInt();
        
        // precompute the max height to the left and right
        int left[] = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i - 1], arr[i]);
        int right[] = new int[n];
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);
        
        int res = 0;
        for (int i = 1; i < n - 1; i++) 
            res += Math.min(left[i], right[i]) - arr[i];
        
        System.out.println("Answer: " + res);
        in.close();
    }
}
