public class SortStack {
    static void sort(StackUsingLinkedList st) {
        if (st.empty()) return;

        StackUsingLinkedList temp = new StackUsingLinkedList();
        int x = st.pop();
        sort(st);
        while (!st.empty() && st.peek() < x)
            temp.add(st.pop());
        st.add(x);
        while (!temp.empty())
            st.add(temp.pop());
    }

    public static void main(String[] args) {
        StackUsingLinkedList st = new StackUsingLinkedList();
        st.add(10);
        st.add(40);
        st.add(0);
        st.add(50);
        st.add(5);
        st.add(60);
        st.add(20);
        sort(st);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

    }
}
