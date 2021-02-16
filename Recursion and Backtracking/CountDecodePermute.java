import java.util.Scanner;
public class CountDecodePermute {
    static int countDecodePermute(char[] s, int i, String res) {
        // base case
        if (i >= s.length - 1) {
            if (i == s.length - 1) res = res + (char)(s[i] - '1' + 'a');
            System.out.println(res);
            return 1;
        }
        
        int count = 0;
        if (s[i] > '0') count = countDecodePermute(s, i + 1, res + (char)(s[i] - '1' + 'a'));
        if (s[i] > '0' && s[i] < '3' && s[i + 1] < '7')
            count += countDecodePermute(s, i + 2, res + (char)(10 * (s[i] - '0') + (s[i + 1] - '0') + 'a' - 1));
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(countDecodePermute(s.toCharArray(), 0, ""));
    }
}
