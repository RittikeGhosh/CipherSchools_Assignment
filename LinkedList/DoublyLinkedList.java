public class DoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;
        Node(int x) {
            data = x;
            next = prev = null;
        }
    }

    Node HEAD;
    Node TAIL;
    DoublyLinkedList() {HEAD = TAIL = null;}

    void add(int x) {
        if (HEAD == null) {
            HEAD = TAIL = new Node(x);
            return;
        }
        else {
            TAIL.next = new Node(x);
            TAIL.next.prev = TAIL;
            TAIL = TAIL.next;
        }
    }

    void remove(int x) {
        if (HEAD == null) return;
        if (HEAD.data == x) {
            HEAD = HEAD.next;
            HEAD.prev.next = null;
            HEAD.prev = null;
            return;
        }
        Node temp = HEAD.next;
        while (temp != null) {
            if (temp.data == x) {
                if (temp == TAIL) TAIL = temp.prev;
                temp.prev.next = temp.next;
                if (temp.next != null)
                    temp.next.prev = temp.prev;
            }
            temp = temp.next;
        }
    }

    void traverse() {
        Node temp = HEAD;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void update(int x, int y) {
        Node temp = HEAD;
        while (temp != null) {
            if (temp.data == x) {
                temp.data = y;
                return;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.traverse();
        list.remove(4);
        list.traverse();
        list.update(2, 22);
        list.traverse();
    }
}
