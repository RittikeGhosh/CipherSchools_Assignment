import java.util.Scanner;
public class IntersectionPoint {
    static int length(SLNode head) {
        if (head == null) return 0;
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }
    static int findIntersection(SLNode head1, SLNode head2) {
        // find the minmum length of the the lists
        int len1 = length(head1);
        int len2 = length(head2);
        int len = Math.abs(len1 - len2);
        if (len1 < len2) {
            SLNode temp = head1;
            head1 = head2;
            head2 = temp;
        }
        while (len > 0) {
            head1 = head1.next;
            len--;
        }

        while (head1 != head2) {
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1.data;
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
        SLNode head1 = null, head2 = null;
        head1 = addNodes(head1, in);
        head2 = addNodes(head2, in);

        int intersectionNode = in.nextInt();
        SLNode temp1 = head1, temp2 = head2;
        while (temp2 != null && temp2.next != null) 
            temp2 = temp2.next;
        while (intersectionNode > 0 && temp1 != null && temp1.next != null) {
            temp1 = temp1.next;
            intersectionNode--;
        }
        temp2.next = temp1;

        System.out.println("Intersection Point: " + findIntersection(head1, head2));
        in.close();
    }
}
