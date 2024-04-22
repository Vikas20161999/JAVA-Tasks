package Tasks;
                              /*  D4Task3a   */
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class CustomStack<T> {
    private List<T> stack;

    public CustomStack() {
        stack = new ArrayList<>();
    }

    // Push operation to add an element to the top of the stack
    public void push(T item) {
        stack.add(item);
    }

    // Pop operation to remove and return the element from the top of the stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    // Peek operation to return the element from the top of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();

        // Pushing integers onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Popping and displaying integers until the stack is empty
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
    }
}

