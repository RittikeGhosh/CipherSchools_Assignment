import java.util.Scanner;
public class Sort {
    public static SLNode merge(SLNode head1, SLNode head2) {
        if (head1 == null || head2 == null)
            return (head1 == null ? head2 : head1);

        SLNode head = null, curr = null, temp = null;
        if (head1.data > head2.data) {
            temp = head1;
            head1 = head2;
            head2 = temp;
        }
        head = curr = head1;
        head1 = head1.next;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp = head1;
                head1 = head1.next;
            }
            else {
                temp = head2;
                head2 = head2.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
        if (head1 != null) curr.next = head1;
        if (head2 != null) curr.next = head2;
        return head; 
    }

    static SLNode sort(SLNode head, int len) {
        if (len < 2) return head;
        int mid = len / 2;
        SLNode first = head, second = head, temp = null;;
        for (int i = 1; i < mid; i++)
            second = second.next;

        // split the list
        temp = second.next;
        second.next = null;
        second = temp;

        first  = sort(first, mid);
        second = sort(second, len - mid);
        head =   merge(first, second);

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

    static int length(SLNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SLNode head = addNodes(in);
        int len = length(head);
        traverseList(head);
        head = sort(head, len);
        traverseList(head);
        in.close();
    }
}
