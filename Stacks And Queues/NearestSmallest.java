import java.util.Scanner;
public class NearestSmallest {
    static void nextMax(int arr[]) {
        StackUsingLinkedList st = new StackUsingLinkedList();
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            while (!st.empty() && st.peek() >= x)
                st.pop();
            arr[i] = (st.empty() ? -1 : st.peek());
            st.add(x);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        
        nextMax(arr);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        in.close();
    }
}
