import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class TwoSum {
    static int[] twoSum(int[] arr, int sum) {
        Map<Integer, Integer> prevMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = sum - arr[i];
            if (prevMap.containsKey(diff))
                return new int[]{ prevMap.get(diff), i };
            prevMap.put(arr[i], i);
        }
        return new int[0]; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = in.nextInt();
        int sum = in.nextInt();

        int res[] = twoSum(arr, sum);
        System.out.printf("[%d, %d]\n", res[0], res[1]);
        in.close();
    }
}