import java.util.Scanner;
public class MaxSumWithNoAdj {
    static int maxSum(int arr[]) {
        int n = arr.length, incl = arr[0], excl = 0, excl_new; 

        for (int i = 1; i < n; i++) { 
            excl_new = (incl > excl) ? incl : excl; 
            incl = excl + arr[i]; 
            excl = excl_new; 
        } 
        return ((incl > excl) ? incl : excl); 
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        System.out.println("Max Sum: " + maxSum(arr));
        in.close();
    }
}
