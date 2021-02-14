import java.util.Scanner;
public class MajorityElement {
    private static int findMajority(int[] arr) {
        int maxx = arr[0], count = 0;
        for (int x: arr) {
            if (x == maxx)
                count++;
            else count--;
            if (count == 0) {
                maxx = x;
                count = 1;
            }
        }
        return maxx;
    }

    private static boolean checkMajority(int[] arr, int x) {
        int count = 0;
        for (int e : arr) {
            if (e == x) count++;
        }
        return count > (arr.length / 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
        
        int maxx = findMajority(arr);
        if (checkMajority(arr, maxx) == true)
            System.out.println(maxx);
        else System.out.println("NO MAJORITY ELEMENT");
        in.close();
    }
}
