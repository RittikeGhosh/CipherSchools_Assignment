import java.util.Scanner;
import java.util.Stack;
public class BalancedPar {
    static boolean balanced(char[] s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '(') 
                st.push((Character) s[i]);
            else if (st.empty()) 
                return false;
            else st.pop();
        }
        return st.size() == 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String eq = in.next();
        if (balanced(eq.toCharArray())) 
            System.out.println("Balanced. ");
        else 
            System.out.println("Not balanced. ");
        in.close();
    }
}
