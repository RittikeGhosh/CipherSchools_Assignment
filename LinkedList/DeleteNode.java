import java.util.Scanner;
public class DeleteNode {
    static SLNode deleteNode(SLNode head, int x) {
        if (head == null) return head;
        if (head.data == x) return head.next;
        SLNode prev = head;
        while (prev.next != null) {
            if (prev.next.data == x) {
                prev.next = prev.next.next;
                return head;
            }
            prev = prev.next;
        }
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
    
    public static void traverseList(SLNode head) {
        if (head == null) return;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SLNode head = addNodes(in);
        System.out.print("Enter node value to delete: ");
        int x = in.nextInt();
        head = deleteNode(head, x);
        traverseList(head);
        in.close();
    }
}
