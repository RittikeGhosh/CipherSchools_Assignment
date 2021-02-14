import java.util.Scanner;

public class PeakElement {
    private static int findPeak(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > arr[mid + 1])
                r = mid;
            else l = mid + 1;
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.println(findPeak(arr));
        in.close();
    }
}
