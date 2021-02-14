import java.util.Scanner;
public class SegregateZerosOnes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = in.nextInt();

        int _0s = 0;
        for (int x : arr) {
            if (x == 0) _0s++;
        }

        for (int i = 0; i < n; i++) {
            if (_0s > 0) {
                arr[i] = 0;
                _0s--;
            }
            else arr[i] = 1;
        }

        for (int x : arr) System.out.print(x + " ");

        in.close();
    }
}
