package Tasks;
                              /*  D4Task3a   */

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class CustomQueue<T> {
    private List<T> queue;

    public CustomQueue() {
        queue = new ArrayList<>();
    }

    // Enqueue operation to add an element to the rear of the queue
    public void enqueue(T item) {
        queue.add(item);
    }

    // Dequeue operation to remove and return the element from the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue.remove(0);
    }

    // Peek operation to return the element from the front of the queue without removing it
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue.get(0);
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        CustomQueue<Object> queue = new CustomQueue<>();

        // Enqueuing strings and integers
        queue.enqueue("Hello");
        queue.enqueue(42);
        queue.enqueue("World");

        // Dequeuing and displaying elements to confirm FIFO order
        while (!queue.isEmpty()) {
            System.out.println("Dequeued element: " + queue.dequeue());
        }
    }
}

