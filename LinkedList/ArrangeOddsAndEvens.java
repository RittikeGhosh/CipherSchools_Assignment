import java.util.Scanner;
public class ArrangeOddsAndEvens {
    static SLNode arrange(SLNode head) {
        SLNode odds = null, evens = null, temp = head, etemp = null, otemp = null;
        while (temp != null) {
            if (temp.data % 2 == 0) {
                if (evens == null) 
                    evens = etemp = temp;
                else {
                    etemp.next = temp;
                    etemp = etemp.next;
                }
            }
            else {
                if (odds == null) 
                    odds = otemp = temp;
                else {
                    otemp.next = temp;
                    otemp = otemp.next;
                }
            }
            temp = temp.next;
        }
        if (evens != null) 
            etemp.next = null;
        if (odds != null) {
            otemp.next = evens;
            return odds;
        }
        else return evens;
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
        HEAD = arrange(HEAD);
        System.out.print("Modified List: ");
        traverseList(HEAD);
        in.close();
    }
}
