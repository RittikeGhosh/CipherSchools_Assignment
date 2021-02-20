import java.util.Scanner;
public class LargestAreaHistogram {
    static int solve(int arr[]) {
        StackUsingLinkedList s = new StackUsingLinkedList();
        int res=0, tp, curr, n = arr.length;
        for(int i=0;i<n;i++){
            while(s.empty()==false && arr[s.peek()]>=arr[i]){
                tp=s.peek();s.pop();
                curr=arr[tp]* (s.empty() ? i : i - s.peek() - 1);
                res=Math.max(res,curr);
            }
            s.add(i);
        }
        while(s.empty()==false){
            tp=s.peek();s.pop();
            curr=arr[tp]* (s.empty() ? n : n - s.peek() - 1);
            res=Math.max(res,curr);
        }
        
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = in.nextInt();
        System.out.println("Maximum Area: " + solve(arr));
        in.close();
    }
}
