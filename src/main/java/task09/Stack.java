package task09;

import java.util.ArrayList;

public class Stack<T> {
    private final ArrayList<T> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        int idx = stack.size()-1;
        if (stack.size() > 0) {
            T element = stack.get(idx);
            stack.remove(idx);
            return element;
        }

        return null;
    }

    public T peek() {
        int idx = stack.size()-1;
        if (stack.size() > 0) {
            return stack.get(idx);
        }

        return null;
    }

    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        return String.format("Stack: %s", stack);
    }
}
