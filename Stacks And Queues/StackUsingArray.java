public class StackUsingArray {
    int arr[];
    int head;
    int tail;
    StackUsingArray(int n) {
        arr = new int[n];
        tail = 0;
    }
    void push(int x) {
        if (tail == arr.length) return;
        else arr[tail++] = x;
    }
    int pop() {
        if (tail == 0) return -1;
        else return arr[--tail];
    }
    int peek() {
        if (tail == 0) return -1;
        else return arr[tail - 1];
    }
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(10);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.push(110);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
