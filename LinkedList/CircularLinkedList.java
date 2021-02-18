public class CircularLinkedList {
    class Node {
        int data;
        Node next;
        Node(int x) {data = x;}
        Node(int x, Node nxt) {
            data = x;
            this.next = nxt;
        }
    }

    Node HEAD = null, TAIL = null;
    CircularLinkedList() {};

    void add(int x) {
        if (HEAD == null) {
            HEAD = TAIL = new Node(x);
            HEAD.next = HEAD;
            return;
        }
        TAIL.next = new Node(x, HEAD);
        TAIL = TAIL.next;
    }

    void update(int x, int y) {
        if (HEAD == null) return;
        Node beg = HEAD, cur = HEAD.next;
        while (cur != beg) {
            if (cur.data == x) {
                cur.data = y;
                return;
            }
            cur = cur.next;
        }
    }

    void remove(int x) {
        if (HEAD == null) return;
        if (HEAD.data == x) {
            if (HEAD == TAIL) 
                HEAD = TAIL = null;
            else {
                HEAD = HEAD.next;
                TAIL.next = HEAD;
            }
            return;
        }
        Node beg = HEAD, prev = HEAD, cur = HEAD.next;
        while (cur != beg) {
            if (cur.data == x) {
                if (TAIL == cur) TAIL = prev;
                prev.next = cur.next;
                return;
            }
            prev = cur;
            cur = cur.next;
        }
    }

    void traverse() {
        if (HEAD == null) return;
        Node cur = HEAD;
        do {
            System.out.print(cur.data + "  ");
            cur = cur.next;
        } while(HEAD != cur);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        // list.traverse();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.traverse();
        list.remove(4);
        list.traverse();
        list.update(2, 22);
        list.traverse();
        list.remove(1);
        list.remove(22);
        list.traverse();
        list.remove(3);
        list.traverse();
        list.add(10);
        list.traverse();
    }
}
