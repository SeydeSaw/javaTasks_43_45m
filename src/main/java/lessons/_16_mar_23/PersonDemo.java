package lessons._16_mar_23;

import java.util.*;

public class PersonDemo {
    public static void main(String[] args) {

        Person p1 = new Person("Anna","Annava", "female", 31, 5000);
        Person p2 = new Person("Boris","Borisov", "male", 38, 7000);
        Person p3 = new Person("Pavel","Pavlov", "male", 30, 5000);
        Person p4 = new Person("Pavel","Pavlov", "male", 36, 6000);
        Person p5 = new Person("Elena","Lenova", "female", 30, 4000);
        Person p6 = new Person("Elena","Lenova", "female", 38, 7000);
        Person p7 = new Person("Ekaterina","Lenova", "female", 28, 4000);

        Set<Person> persons = new TreeSet<>();

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);
        persons.add(p7);

        System.out.println(persons);
        System.out.println(" ");
        System.out.println("HachCode person1 = " + p1.hashCode());
        System.out.println("HachCode person2 = " + p2.hashCode());
        System.out.println("HachCode person3 = " + p3.hashCode());
        System.out.println("HachCode person4 = " + p4.hashCode());
        System.out.println("HachCode person5 = " + p5.hashCode());
        System.out.println("HachCode person6 = " + p6.hashCode());
        System.out.println("HachCode person7 = " + p7.hashCode());
        System.out.println(" ");
        System.out.println("HachCode persons = " + persons.hashCode());
    }
}