public class QueueUsingStack {
    StackUsingLinkedList st1, st2;
    QueueUsingStack() {
        st1 = new StackUsingLinkedList();
        st2 = new StackUsingLinkedList();
    }

    void push(int x) {st1.add(x);}

    int pop() {
        if (st1.empty()) return -1;
        int x = st1.pop();
        while (!st1.empty()) {
            st2.add(x);
            x = st1.pop();
        }
        while (!st2.empty())
            st1.add(st2.pop());
        return x;
    }

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        
    }
}
