import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;
public class Median {
    static void median(int arr[]) {
        double med = arr[0]; 
        PriorityQueue<Integer> smaller = new PriorityQueue<>(Collections.reverseOrder()); 
        PriorityQueue<Integer> greater = new PriorityQueue<>(); 
        smaller.add(arr[0]); 
        System.out.println(med); 
        for(int i = 1; i < arr.length; i++) { 
            int x = arr[i]; 
            if(smaller.size() > greater.size()) { 
                if(x < med) { 
                    greater.add(smaller.remove()); 
                    smaller.add(x); 
                } 
                else
                    greater.add(x); 
                med = (double)(smaller.peek() + greater.peek())/2; 
            } 
            else if(smaller.size() == greater.size()) { 
                if(x < med) { 
                    smaller.add(x); 
                    med = (double)smaller.peek(); 
                } 
                else { 
                    greater.add(x); 
                    med = (double)greater.peek(); 
                } 
            } 
            else { 
                if(x > med) { 
                    smaller.add(greater.remove()); 
                    greater.add(x); 
                } 
                else
                    smaller.add(x); 
                med = (double)(smaller.peek() + greater.peek())/2; 
                  
            } 
            System.out.println(med); 
        } 
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = in.nextInt();
        median(arr);
        in.close();
    }
}
