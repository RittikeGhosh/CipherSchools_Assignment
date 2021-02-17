import java.util.Scanner;
public class DetectAndRemoveLoop {
    static boolean checkCycle(SLNode head) {
        if (head == null) return false;
        SLNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
    static void removeCycle(SLNode head) {
        SLNode fast, slow;
        slow = fast = head;
        while (true) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) break;
        }
        slow = head;
        if (fast == slow) {
            fast = fast.next;
            while (fast.next != slow) fast = fast.next;
            fast.next = null;
        }
        else {
            while (fast.next != slow.next) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        fast.next = null;
    }

    static void detectAndRemoveCycle(SLNode head) {
        if (checkCycle(head) == false) 
            System.out.println("No Cycle");
        else {
            System.out.println("Has Cycle. Removing Cycle...");
            removeCycle(head);
        }
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
        System.out.print("Enter the node no. to join the back. [-1 to skip]: ");
        int loopPoint = in.nextInt();
        if (loopPoint != -1) {
            loopPoint--;
            SLNode temp = HEAD, end = HEAD;
            while (loopPoint > 0 && temp.next != null) {
                temp = temp.next;
                end = end.next;
                loopPoint--;
            }
            while (end.next != null) end = end.next;
            end.next = temp;
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
        detectAndRemoveCycle(HEAD);
        traverseList(HEAD);
        in.close();
    }
}
