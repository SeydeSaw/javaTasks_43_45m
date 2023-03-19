package lessons._16_mar_23;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonComparatorDemo {
    public static void main(String[] args) {
        //сравниваем сначала по возрасту, если повторяется, то по полу
        Comparator<Person> comparatorPerson = new PersonIntComparator().thenComparing(new PersonStrComparator());
        Set<Person> ourPersons = new TreeSet<>(comparatorPerson);

        ourPersons.add(new Person("Anna","Annava", "female", 31, 5000));
        ourPersons.add(new Person("Boris","Borisov", "male", 38, 7000));
        ourPersons.add(new Person("Pavel","Pavlov", "male", 30, 5000));
        ourPersons.add(new Person("Pavel","Pavlov", "male", 36, 6000));
        ourPersons.add(new Person("Elena","Lenova", "female", 30, 4000));
        ourPersons.add(new Person("Elena","Lenova", "female", 38, 7000));
        ourPersons.add(new Person("Ekaterina","Lenova", "female", 28, 4000));

        System.out.println(ourPersons);
    }
}