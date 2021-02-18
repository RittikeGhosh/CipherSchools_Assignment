public class SingleLinkedList {
    class Node {
        int data;
        Node next;
        Node(int x) {data = x;}
    }

    private Node TAIL;
    Node HEAD;
    SingleLinkedList() {HEAD = TAIL = null;}
    void add(int x) {
        if (HEAD == null) 
            HEAD = TAIL = new Node(x);
        else {
            TAIL.next = new Node(x);
            TAIL = TAIL.next;
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

    void remove(int x) {
        if (HEAD == null) return;
        if (HEAD.data == x) {
            HEAD = HEAD.next;
            return;
        }
        Node temp = HEAD.next, prev = HEAD;
        while (temp != null) {
            if (temp.data == x) {
                if (temp == TAIL) TAIL = prev;
                prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
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
        SingleLinkedList list = new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.traverse();
        list.remove(3);
        list.traverse();
        list.update(1, 10);
        list.traverse();
    }
}
