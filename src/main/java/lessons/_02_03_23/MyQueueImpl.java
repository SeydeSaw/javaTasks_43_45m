package lessons._02_03_23;

import java.util.ArrayList;

public class MyQueueImpl<T> implements MyQueue<T> {
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void add(T el) {//at the end of this list
        list.add(list.size(),el);
    }

    @Override
    public void remove() {//first and return
        list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.size()==0;
    }

    @Override
    public T get() {//only first
        return list.get(0);
    }
}