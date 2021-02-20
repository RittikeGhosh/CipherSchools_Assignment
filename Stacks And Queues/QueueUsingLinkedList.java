public class QueueUsingLinkedList {
    class Node {
        int data;
        Node next;
        Node(int x){data = x; next = null;}
    }

    void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } 
        System.out.println();
    }
    Node head, tail;
    int size;
    QueueUsingLinkedList() {head = tail = null;}

    void add(int x) {
        if (head == null) head = tail = new Node(x);
        else {
            tail.next = new Node(x);
            tail = tail.next;
            size = 0;
        }
        size++;
    }

    int pop() {
        if (head == null) return -1;
        size--;
        int x = head.data;
        if (head.next == null)
            head = tail = null;
        else 
            head = head.next;
        return x;
    }

    int peek() {
        if (head == null) return -1;
        else return head.data;
    }

    boolean empty() {return head == null;}

    int size() {return size;}

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.add(10);
        queue.add(20);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println(queue.peek());
        System.out.println(queue.pop());

    }
    
}
