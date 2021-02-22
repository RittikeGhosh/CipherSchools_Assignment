import java.util.Scanner;
public class LongestPalindromicSequence {
    static int lps(char[] s) {
        int n = s.length;
        int mem[][] = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            mem[i][i] = 1;
            for(int j = i + 1; j < n; j++) {
                if(s[i] == s[j])
                    mem[i][j] = mem[i+1][j-1] + 2;
                else
                    mem[i][j] = Math.max(mem[i][j-1], mem[i+1][j]);
            }
        }

        return mem[0][n - 1];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println("Longest Palindromic Subsequnce: " + lps(s.toCharArray()));
        in.close();
    }
}
