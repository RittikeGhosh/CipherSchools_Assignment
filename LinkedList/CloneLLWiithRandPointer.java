class RandNode {
    int data;
    RandNode next;
    RandNode random;
    public RandNode(int x) {
        data = x;
        random = next = null;
    }
}
public class CloneLLWiithRandPointer {
    static RandNode cloneList(RandNode head) {
        if (head == null) return head;
        // append duplicate node after the originals
        RandNode cur = head, temp = null;
        while (cur != null) {
            temp = new RandNode(cur.data);
            temp.next = cur.next;
            cur.next = temp;
            cur = temp.next;
        }
        
        temp = cur = head;
        while (cur != null && cur.next != null) {
            cur.next.random = (cur.random == null ? null : cur.random.next);
            cur = cur.next.next;
        }

        temp = cur = head.next;
        while (cur != null && cur.next != null) {
            cur.next = cur.next.next;
            cur = cur.next;
        }
        return temp;
    }

    public static void traverseList(RandNode head) {
        if (head == null) return;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RandNode start = new RandNode(1);  
        start.next = new RandNode(2);  
        start.next.next = new RandNode(3);  
        start.next.next.next = new RandNode(4);  
        start.next.next.next.next = new RandNode(5);  
  
        // 1's random points to 3  
        start.random = start.next.next;  
  
        // 2's random points to 1  
        start.next.random = start;  
  
        // 3's and 4's random points to 5  
        start.next.next.random = start.next.next.next.next;  
        start.next.next.next.random = start.next.next.next.next;  
  
        // 5's random points to 2  
        start.next.next.next.next.random = start.next;  
  
        System.out.println("Original list : ");  
        traverseList(start);  
  
        System.out.println("Cloned list : ");  
        RandNode cloned_list = cloneList(start);  
        traverseList(cloned_list); 
    }
}
