package org.example.Generic_Collections.Generic.EX4;

import java.util.*;

public class Stack<T> {

    private ArrayList<T> arrayList;

    public Stack() {
        arrayList = new ArrayList<>();
    }

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void push(T element) {
        arrayList.add(element);
    }

    public T pop() {
        if (!isEmpty()) {
            return arrayList.remove(0);
        } else
            throw new NoSuchElementException("stack is empty");
    }

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    public T peek() {
        return arrayList.get(0);
    }

    public static void main(String[] args) {
        Stack<String> newList = new Stack<>();
        newList.push("a");
        newList.push("b");
        // System.out.println(newList.peek());
        System.out.println(newList.getArrayList());

    }

}
