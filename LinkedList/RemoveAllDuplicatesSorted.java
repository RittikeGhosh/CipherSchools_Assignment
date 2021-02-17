import java.util.Scanner;
public class RemoveAllDuplicatesSorted {
    static void removeDuplicates(SLNode head) {
        if (head == null) return;
        SLNode temp = head, curr = head;
        int prev = head.data;
        curr = head.next;
        while (curr != null) {
            if (curr.data != prev) {
                temp.next = curr;
                temp = temp.next;
            }
            prev = curr.data;
            curr = curr.next;
        }
        temp.next = null;
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
        SLNode head= null;
        head = addNodes(head, in);
        traverseList(head);
        removeDuplicates(head);
        traverseList(head);
        in.close();
    }
}
