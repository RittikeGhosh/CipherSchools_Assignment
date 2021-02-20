    import java.util.Scanner;
    public class LargestInWindowOfK {
        static void largestInWindow(int arr[], int k) {
            Deque q = new Deque();
            q.pushFront(0);
            for (int i = 1; i < arr.length; i++) {
                while (!q.isEmpty() && arr[q.peekRear()] <= arr[i])
                    q.popRear();
                
                while (!q.isEmpty() && q.peekFront() <= (i - k))
                    q.popFront();

                q.pushRear(i);
                if (i + 1 >= k) 
                    System.out.print(arr[q.peekFront()] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) 
                arr[i] = in.nextInt();
            
            int k = in.nextInt();
            largestInWindow(arr, k);
            in.close();
        }
    }
