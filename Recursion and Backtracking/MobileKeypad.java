import java.util.Scanner;
public class MobileKeypad {
    final static String[] KEYPAD = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"} ;
    static void printCombinations(int n, String s, String res) {
        if (n == s.length()) {
            System.out.print(res + " ");
            return;
        }
        int j = Character.getNumericValue(s.charAt(n));
        if (KEYPAD[j].length() == 0)
            printCombinations(n + 1, s, res);
        for (int i = 0; i < KEYPAD[j].length(); i++)
            printCombinations(n + 1, s, res + KEYPAD[j].charAt(i));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        printCombinations(0, s, "");
    }
}
