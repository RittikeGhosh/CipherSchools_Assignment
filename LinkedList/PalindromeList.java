import java.util.Scanner;
import java.util.Stack;
public class PalindromeList {
    public static boolean isPalindrom(SLNode HEAD) {
        if (HEAD == null || HEAD.next == null) 
            return true;
        Stack<Integer> st = new Stack<>();
        SLNode temp = HEAD;
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

        temp = HEAD;
        while (HEAD != null) {
            if (HEAD.data != st.pop())
                return false;
            HEAD = HEAD.next;
        }
        return true;
    }

    public static SLNode addNodes(SLNode HEAD, Scanner in) {
        int n = in.nextInt();
        if (n == 0) return HEAD;
        int x = in.nextInt();
        HEAD = new SLNode(x);
        while (n > 1) {
            x = in.nextInt();
            SLNode node = new SLNode(x);
            node.next = HEAD;
            HEAD = node;
            n--;
        }
        return HEAD;
    }
    public static void traverseList(SLNode HEAD) {
        if (HEAD == null) return;
        SLNode temp = HEAD;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SLNode HEAD = null;
        HEAD = addNodes(HEAD, in);
        System.out.println((isPalindrom(HEAD) == true ? "Palindrom" : "Not Palindrom"));
        in.close();
    }
}
