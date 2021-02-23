import java.util.Scanner;
public class ClimbStairs {
    static int climbStairs(int n ) {
        if (n <= 2) return n;
        int a = 1, b = 2, c;
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    } 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(climbStairs(n));;
        in.close();
    }
}
