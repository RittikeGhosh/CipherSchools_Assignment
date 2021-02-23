import java.util.PriorityQueue;
import java.util.Scanner;
public class NRopesWithMinCost {
    static int minCost(int arr[]) {
        int n = arr.length, res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++)
            pq.add(arr[i]);
        while (pq.size() > 1) {
            int f = pq.poll(), s = pq.poll();
            res += f + s;
            pq.add(f + s);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.println("Cost of Connecting: " + minCost(arr));
        in.close();
    }
}
