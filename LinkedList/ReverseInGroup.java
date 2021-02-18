import java.util.Scanner;
public class ReverseInGroup {
    static SLNode reverseInGroup(SLNode head, int k) {
        if (head == null || head.next == null ||  k < 2) 
            return head;

        int cnt = k;
        SLNode prev = null, temp = null, old_head = head;
        while (head.next != null && cnt > 1) {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
            cnt--;
        }
        old_head.next = reverseInGroup(head.next, k);
        head.next = prev;
        return head;
    }

    public static SLNode addNodes(Scanner in) {
        System.out.print("Enter the number of nodes: ");
        int n = in.nextInt();
        if (n == 0) return null;

        int x = in.nextInt();
        SLNode head = new SLNode(x), end;
        end = head;
        for (int i = 1; i < n; i++) {
            x = in.nextInt();
            end.next = new SLNode(x);
            end = end.next;
        }
        return head;
    }
    
    public static void traverseList(SLNode HEAD) {
        if (HEAD == null) return;
        while (HEAD != null) {
            System.out.print(HEAD.data + " ");
            HEAD = HEAD.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SLNode head = addNodes(in);
        System.out.print("Enter Group size: ");
        int k = in.nextInt();
        head = reverseInGroup(head, k);
        traverseList(head);
        in.close();
    }
}
