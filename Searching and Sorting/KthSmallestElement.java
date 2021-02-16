import java.util.Scanner;
import java.util.PriorityQueue;
public class KthSmallestElement {
    static int kthElement(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : arr) pq.add(x);
        int res = 0;
        while (!pq.isEmpty() && k-- > 0)
            res = pq.remove();
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int k = in.nextInt();
        System.out.println(kthElement(arr, k));
        in.close();
    }   
}
