public class StackUsingQueues {
    QueueUsingLinkedList q1 = null, q2 = null, temp = null;
    StackUsingQueues() {
        q1 = new QueueUsingLinkedList();
        q2 = new QueueUsingLinkedList();
    }

    void add(int x) {q1.add(x);}

    int pop() {
        if (q1.empty()) return -1;
        int x = q1.pop();
        while (!q1.empty()) {
            q2.add(x);
            x = q1.pop();
        }
        temp = q1;
        q1 = q2;
        q2 = temp;
        return x;
    }
    public static void main(String[] args) {
        StackUsingQueues st = new StackUsingQueues();
        st.add(10);
        st.add(20);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.add(30);
        st.add(40);
        st.add(50);
        st.add(60);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
