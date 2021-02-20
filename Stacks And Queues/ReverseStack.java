public class ReverseStack {
    static void reverse(StackUsingLinkedList st) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        while (!st.empty()) 
            q.add(st.pop());
        while (!q.empty())
            st.add(q.pop());
    }
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);
        reverse(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
