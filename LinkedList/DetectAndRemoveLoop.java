import java.util.Scanner;
public class DetectAndRemoveLoop {
    static boolean checkCycle(SLNode head) {
        if (head == null) return false;
        SLNode slow = head, fast = head.next;
        while (fast != null && faet.next != null) {
            if (slow == fast) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
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
