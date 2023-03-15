package lessons._09_mar_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyIteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));//добавление в лист случайного числа в диапазоне от 0 до 100
        }

        System.out.println(new MyIterator().hasPrevious(list));
        System.out.println(new MyIterator().hasNext(list));
        System.out.println(new MyIterator().next(list));
        System.out.println(new MyIterator().hasPrevious(list));

    }
}
