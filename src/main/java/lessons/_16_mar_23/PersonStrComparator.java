package lessons._16_mar_23;

import java.util.Comparator;
public class PersonStrComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getSex().compareTo(person2.getSex());
    }
}