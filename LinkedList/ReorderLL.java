import java.util.Scanner;
public class ReorderLL {
    public static SLNode getMid(SLNode head) {
        if (head == null || head.next == null)  
            return head;
        
        SLNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static SLNode reverse(SLNode head) {
        if (head == null || head.next == null)
            return head;
        SLNode prev = null, temp = null;
        while (head.next != null) {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        head.next = prev;
        return head;
    }

    public static SLNode reorder(SLNode head) {
        SLNode first = null, second = null, mid = getMid(head);
        first = head;
        second = mid.next;
        mid.next = null;
        
        // reverse the second list;
        second = reverse(second);
        
        // traverse the list and merge them 
        SLNode temp = null;
        while (second != null) {
            temp = second.next;
            second.next = first.next;
            first.next = second;
            first = second.next;
            second = temp;
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
        head = reorder(head);
        traverseList(head);
        in.close();
    }
}
