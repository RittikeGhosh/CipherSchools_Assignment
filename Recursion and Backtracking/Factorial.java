import java.util.Scanner;
public class Factorial {
    static int factorail(int n, int fact) {
        if (n == 0) return fact;
        return factorail(n - 1, fact * n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(factorail(n, 1));
    }
}
