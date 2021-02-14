import java.util.Scanner;
import java.util.Arrays;
public class AlternativeSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while (i < j) {
            System.out.print(arr[j] + " ");
            j--;
            System.out.print(arr[i] + " ");
            i++;
        }
        if (n % 2 != 0) System.out.print(arr[i] + " ");
        in.close();
    }
}
