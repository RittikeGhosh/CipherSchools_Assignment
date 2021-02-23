import java.util.Scanner;
public class MinJumpsToReachEnd {
    static int minJumps(int arr[]) {
        int min, n = arr.length;
        int[] jumps = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] == 0)
                jumps[i] = Integer.MAX_VALUE;
            else if (arr[i] >= n - i - 1)
                jumps[i] = 1;
            else {
                min = Integer.MAX_VALUE;
                for (int j = i + 1; j < n && j <= arr[i] + i; j++) {
                    if (min > jumps[j])
                        min = jumps[j];
                }
                if (min != Integer.MAX_VALUE)
                    jumps[i] = min + 1;
                else
                    jumps[i] = min;
            }
        }

        return jumps[0];
    }
    public static void main(String[] args) {
        java.util.Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.println("Minimum Jumps: " + minJumps(arr));
        in.close();
    }
}
