package Generic.genericStackClass;

import java.util.ArrayList;


public class Stack<T> {
    private ArrayList<T> element;

    public Stack() {
        element = new ArrayList<>();
    }

    public void push(T newElement) {
        element.add(newElement);
    }

    public T pop() {
        if(isEmpty()) {
            System.out.println("Empty");
        }
        return element.remove(element.size() - 1);
    }

    public T peek() {
        if(isEmpty()) {
            System.out.println("Empty");
        }
        return element.get(element.size() - 1);
    }

    private boolean isEmpty() {
        return element.isEmpty();
    }
}
