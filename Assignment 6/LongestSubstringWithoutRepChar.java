import java.util.Scanner;
public class LongestSubstringWithoutRepChar {
    static int longestSubstring(char[] s) {
        int n = s.length, res = 0, i = 0;
        int[] lastIndex = new int[256];
        for (int j = 0; j < n; j++) {
            i = Math.max(i, lastIndex[s[j]] + 1);
            res = Math.max(res, j - i + 1);
            lastIndex[s[j]] = j;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println("Longest Non-repeating Substring: " + 
            longestSubstring(s.toCharArray()));
        in.close();
    }
}
