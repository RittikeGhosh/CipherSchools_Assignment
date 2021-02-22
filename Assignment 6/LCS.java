import java.util.Scanner;
public class LCS {
    static int lcs(char[] s1, char[] s2) {
        int m = s1.length, n = s2.length;
        int mem[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    mem[i][j] = 0;
                else if (s1[i - 1] == s2[j - 1])
                    mem[i][j] = mem[i - 1][j - 1] + 1;
                else 
                    mem[i][j] = Math.max(mem[i - 1][j], mem[i][j - 1]);
            }
        }
        return mem[m][n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next(), s2 = in.next();
        System.out.println("LCS: " +
            lcs(s1.toCharArray(), s2.toCharArray()));
        in.close();
    }
}
