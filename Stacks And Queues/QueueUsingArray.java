public class QueueUsingArray {
    int arr[];
    int rear, front;
    QueueUsingArray(int n) {
        arr = new int[n + 1];
        front = rear = 0;
    }
    void push(int x) {
        if ((rear + 1) % arr.length == front) 
            return;
        else arr[rear++ % arr.length] = x;
    }

    int pop() {
        if (front == rear) return -1;
        else return arr[front++ % arr.length];
    }

    int peek() {
        if (front == rear) return -1;
        return arr[front];
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(10);
        queue.push(10);
        queue.push(20);
        System.out.println(queue.pop());
        System.out.println(queue.front + " " + queue.rear);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.front + " " + queue.rear);
        
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);
        queue.push(60);
        queue.push(70);
        queue.push(80);
        queue.push(90);
        queue.push(100);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
    }
}
