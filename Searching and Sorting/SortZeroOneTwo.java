import java.util.Scanner;
public class SortZeroOneTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int _0s = 0, _1s = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) _0s++;
            else if (arr[i] == 1) _1s++;
        }
        for (int i = 0; i < n; i++) {
            if (_0s > 0) {
                arr[i] = 0;
                _0s--;
            }
            else if (_1s > 0) {
                arr[i] = 1;
                _1s--;
            }
            else arr[i] = 2;
        }
        for (int x : arr) System.out.print(x + " ");

        in.close();
    }
}
