import java.util.Scanner;
public class AddTwoNumbersReprList {
    public static SLNode add(SLNode head1, SLNode head2) {
        SLNode head = null, temp = null;
        int carry = 0;
        while (head1 != null || head2 != null) {
            int sum = carry;
            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            } 
            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }
            carry = sum / 10;
            sum = sum % 10;
            if (head == null) 
                head = temp = new SLNode(sum);
            else {
                temp.next = new SLNode(sum);
                temp = temp.next;
            }
        }
        if (carry > 0) 
            temp.next = new SLNode(carry);
        return head;
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
        SLNode HEAD1 = null, HEAD2 = null;
        HEAD1 = addNodes(HEAD1, in);
        HEAD2 = addNodes(HEAD2, in);
        // traverseList(HEAD1);
        // traverseList(HEAD2);
        SLNode finalHead = add(HEAD1, HEAD2);
        traverseList(finalHead);
        in.close();
    }
}
