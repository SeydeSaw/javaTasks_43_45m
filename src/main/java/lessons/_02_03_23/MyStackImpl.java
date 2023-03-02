package lessons._02_03_23;

import java.util.ArrayList;

public class MyStackImpl<T> implements MyQueue<T>{
    private ArrayList<T> stack = new ArrayList<>();
    @Override
    public void add(T el) {
        stack.add(el);
    }

    @Override
    public void remove() {
        stack.remove(stack.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return stack.size()==0;
    }

    @Override
    public T get() {
        return stack.get(stack.size()-1);
    }
}