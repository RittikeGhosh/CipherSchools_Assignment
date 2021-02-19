public class StackUsingLinkedList {
    class Node{
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    }

    Node head;
    StackUsingLinkedList() {head = null;}

    void add(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
    }

    int pop() {
        if (head == null) return -1;
        int x = head.data;
        head = head.next;
        return x;
    }

    int peek() {
        if (head == null) return -1;
        else return head.data;
    }

    boolean empty() {return head == null;}

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.add(10);
        stack.add(20);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

    }
}
