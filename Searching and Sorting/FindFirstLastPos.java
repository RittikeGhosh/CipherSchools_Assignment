import java.util.Scanner;
public class FindFirstLastPos {
    static void findElem(int arr[], int val) {

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        int val = in.nextInt();

        findElem(arr, val);
        in.close();
    }
    
}