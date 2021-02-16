import java.util.Scanner;
public class GenerateBalancedParanthesis {
    static void genBalancedParenthesis(int n, String s, int openPar) {
        // base case
        if (openPar > n) return;
        if (n == 0) {
            System.out.println(s);
            return;
        }

        genBalancedParenthesis(n - 1, s + "(", openPar + 1);
        if (openPar > 0)
            genBalancedParenthesis(n - 1, s + ")", openPar - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        genBalancedParenthesis(2 * n, "", 0);
    }
}
