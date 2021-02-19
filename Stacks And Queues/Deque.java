public class Deque {
    class Node {
        int data;
        Node next;
        Node prev;
        Node (int x, Node ptr1, Node ptr2) {
            data = x;
            prev = ptr1;
            next = ptr2;
        }
    }

    Node head, tail;
    Deque() {head = tail = null;}

    void pushFront(int x) {
        Node temp = null;
        if (head == null) 
            head = tail = new Node(x, null, null);
        else {
            temp = new Node(x, null, head);
            head.prev = temp;
            head = temp;
        }
    }

    void pushRear(int x) {
        Node temp = null;
        if (head == null) 
            head = tail = new Node(x, null, null);
        else {
            temp = new Node(x, tail, null);
            tail.next = temp;
            tail = temp;
        }
    }

    boolean isEmpty() {return head == null;}

    int peekFront() {
        if (isEmpty()) return -1;
        return head.data;
    }

    int peekRear() {
        if (isEmpty()) return -1;
        return tail.data;
    }

    int popFront() {
        if (isEmpty()) return -1;
        int x = head.data;
        if (head.next == null) 
            head = tail = null;
        else {
            head.next.prev = null;
            head = head.next;
        }
        return x;
    }

    int popRear() {
        if (isEmpty()) return -1;
        int x = tail.data;
        if (head.next == null)
            head = tail = null;
        else {
            tail.prev.next = null;
            tail = tail.prev;
        }
        return x;
    }

    void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Deque q = new Deque();
        q.pushFront(10);
        q.traverse();
        q.pushRear(20);
        q.pushRear(30);
        q.pushFront(30);
        q.traverse();
        System.out.println(q.popFront());
        q.traverse();
        System.out.println(q.popRear());
        q.traverse();
        System.out.println(q.popRear());
        q.traverse();
        System.out.println(q.popFront());
        q.traverse();
    }
}
