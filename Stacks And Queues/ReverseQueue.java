public class ReverseQueue {
    static void reverse(QueueUsingLinkedList q) {
        StackUsingLinkedList st = new StackUsingLinkedList();
        while (!q.empty())
            st.add(q.pop());
        while (!st.empty())
            q.add(st.pop());
    }
    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        reverse(queue);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
