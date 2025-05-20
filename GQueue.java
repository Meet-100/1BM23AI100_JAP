import java.util.Arrays;

public class GQueue<T> {
    private T[] que;
    private int size;

    @SuppressWarnings("unchecked")
    public GQueue() {
        que = (T[]) new Object[2]; // Initial capacity
        size = 0;
    }

    public void enqueue(T element) {
        if (size == que.length) {
            // Double the array size
            int newCapacity = que.length * 2;
            que = Arrays.copyOf(que, newCapacity);
        }
        que[size++] = element;
    }

    public T dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        T del_element = que[0];
        System.arraycopy(que, 1, que, 0, size - 1); // Shift elements
        que[--size] = null; // Remove last duplicate reference
        return del_element;
    }

    public void display() {
        System.out.println("Elements in the queue:");
        for (int i = 0; i < size; i++) {
            System.out.println(que[i]);
        }
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        // Create a GrowableQueue of integers
        GQueue<Integer> integerQueue = new GQueue<>();

        // Enqueue elements
        integerQueue.enqueue(10);
        integerQueue.enqueue(20);
        integerQueue.enqueue(30);

        // Display elements
        integerQueue.display();

        // Dequeue an element
        Integer dequeuedElement = integerQueue.dequeue();
        if (dequeuedElement != null) {
            System.out.println("Dequeued element: " + dequeuedElement);
        }

        // Display remaining elements and size
        integerQueue.display();
        System.out.println("Queue size: " + integerQueue.getSize());
    }
}


