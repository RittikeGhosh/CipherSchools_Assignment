import java.util.Scanner;
public class Fibbonacci {
    static int fibb(int n, int a, int b) {
        if (n == 0) return a;
        if (n == 1) return b;
        return fibb(n - 1, b, a + b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(fibb(n - 1, 0, 1));
    }
}
