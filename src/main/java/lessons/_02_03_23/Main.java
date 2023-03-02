package lessons._02_03_23;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyQueueImpl<Integer> myque = new MyQueueImpl<>();
        myque.add(100);
        System.out.println(myque.isEmpty());
        myque.remove();
        System.out.println(myque.isEmpty());
    }
}