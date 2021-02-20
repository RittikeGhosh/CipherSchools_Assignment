import java.util.Scanner;
import java.util.Stack;
public class DetectDuplicateParenthesis {
    static boolean hasDuplicate(char[] s) {
        Stack<Character> st = new Stack<>(); 
        for (int i = 0; i < s.length; i++) {
            if (s[i] == ' ') continue;
            if (s[i] != ')') st.push(s[i]);
            else if (st.peek() == '(')
                return true;
            else {
                while (!st.empty() && st.peek() != '(')
                    st.pop();
                if (!st.empty()) st.pop();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (hasDuplicate(s.toCharArray()))
            System.out.println("Has Duplicate");
        else
            System.out.println("No Duplicate");
        in.close();
    }
}
