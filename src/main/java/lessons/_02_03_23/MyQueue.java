package lessons._02_03_23;

public interface MyQueue<T> {
    void add(T el);
    void remove();
    boolean isEmpty();
    T get();
}
