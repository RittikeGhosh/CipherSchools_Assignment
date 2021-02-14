import java.util.Scanner;
public class StockBuySell {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = in.nextInt();
        
        int cost = 0, maxCost = 0, minPrice = arr[0];
        for (int i = 0; i < n; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            cost = arr[i] - minPrice;
            maxCost = Math.max(maxCost, cost);
        }

        System.out.println(maxCost);
        in.close();
    }
}
