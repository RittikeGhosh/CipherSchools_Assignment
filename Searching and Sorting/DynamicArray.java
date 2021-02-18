import java.util.Scanner;

public class DynamicArray {
    private int array[];
    private int count;
    private int size;

    public DynamicArray() {   
        size = 10;   
        array = new int[10];   
        count = 0;   
    }

    public void addElement(int a) {
        if (count == size) growSize();
        array[count] = a;
        count++;
    }

    public void growSize() {
        int temp[] = null;
        if (count == size) {
            temp = new int[size * 2];
            for (int i = 0; i < size; i++) 
                temp[i] = array[i];
        }
        array = temp;
        size = size * 2;
    }

    public void shrinkSize() {
        int temp[] = null;
        if (count > 0) {
            temp = new int[count];
            for (int i = 0; i < count; i++) 
                temp[i] = array[i];
            size = count;
            array = temp;
        }
    }

    public void removeElement() {
        if (count > 0) {
            array[count - 1] = 0;
            count--;
        }
    }

    public void removeElementAt(int index) {
        if (count > 0) {
            for (int i = index; i < count - 1; i++) 
                array[i] = array[i + 1];
            array[count - 1] = 0;
            count--;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DynamicArray darr = new DynamicArray();
        System.out.println("Keep adding new elements[press -1 to stop]: ");
        int x = in.nextInt();
        while (x != -1) {
            darr.addElement(x);
            x = in.nextInt();
        }

        for (int i = 0; i < darr.count; i++)
            System.out.print(darr.array[i] + " ");
        System.out.println();
        in.close();
    }
}
