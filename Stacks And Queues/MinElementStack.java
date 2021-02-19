public class MinElementStack  extends StackUsingLinkedList {
    MinElementStack() {}

    @Override
    void add(int x) {
        if (head == null) {
            head = new Node(x);
            return;
        }
        StackUsingLinkedList st = new StackUsingLinkedList();
        while (empty() == false && peek() < x) 
            st.add(pop());
        super.add(x);
        while (st.empty() == false) 
            super.add(st.pop());
    }

    public static void main(String[] args) {
        MinElementStack stack = new MinElementStack();
        stack.add(10);
        stack.add(20);
        stack.add(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
