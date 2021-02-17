import java.util.Scanner;
public class ReverseListRec {
    public static SLNode reverseList(SLNode HEAD) {
        if (HEAD == null || HEAD.next == null)
            return HEAD;
            
        SLNode newHead = reverseList(HEAD.next);
        HEAD.next.next = HEAD;
        HEAD.next = null;
        return newHead;
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
        System.out.print("Original List: ");
        traverseList(HEAD);
        System.out.print("Reversed List: ");
        HEAD = reverseList(HEAD);
        traverseList(HEAD);
        in.close();
    }
}
