public class SortQueue {
    public static int minIndex(QueueUsingLinkedList list, int sortIndex) { 
        int min_index = -1; 
        int min_value = Integer.MAX_VALUE; 
        int s = list.size(); 
        for (int i = 0; i < s; i++) { 
            int current = list.pop(); 
            if (current <= min_value && i <= sortIndex) { 
                min_index = i; 
                min_value = current; 
            } 
            list.add(current);  
        } 
        return min_index; 
    } 
    public static void insertMinToRear(QueueUsingLinkedList list, int min_index) { 
        int min_value = 0;  
        int s = list.size(); 
        for (int i = 0; i < s; i++) { 
            int current = list.pop(); 
            if (i != min_index) 
                list.add(current); 
            else
                min_value = current; 
        } 
        list.add(min_value); 
    } 
    static void sort(QueueUsingLinkedList q) {
        for(int i = 1; i <= q.size(); i++) { 
            int min_index = minIndex(q, q.size() - i); 
            insertMinToRear(q, min_index); 
        } 
    }
    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.add(0);
        q.add(10);
        q.add(60);
        q.add(20);
        q.add(40);
        q.add(15);
        q.add(5);
        sort(q);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}
