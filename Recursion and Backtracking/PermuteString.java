import java.util.Scanner;
public class PermuteString {
    static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    static void printAllPermutation(char[] s, int n) {
        if (n == s.length) {
            System.out.println(String.valueOf(s));
            return;
        }
        for (int i = n; i < s.length; i++) {
            swap(s, n, i);
            printAllPermutation(s, n + 1);
            swap(s, n, i);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        printAllPermutation(s.toCharArray(), 0);
    }
}
