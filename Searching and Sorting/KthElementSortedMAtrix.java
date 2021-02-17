import java.util.Scanner;
import java.util.Collections;
import java.util.PriorityQueue;
public class KthElementSortedMAtrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int k = in.nextInt();
        int n = in.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
                pq.add(arr[i][j]);
                if (pq.size() > k)
                    pq.remove();
            }
        }
        
        System.out.println("Kth smallest element: " + pq.peek());
        in.close();
    }
}
