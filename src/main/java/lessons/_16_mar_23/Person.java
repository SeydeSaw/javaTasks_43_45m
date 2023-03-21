package lessons._16_mar_23;
import java.util.Objects;
/*todo
    Деалем класс с 5 полями разного типа имплементим от компарабле
    делаем compareTo по 3 полям переопределяем equals and hashcode
    для оставшихся двух полей делаем компаратор
 */
public class Person implements  Comparable<Person>{
    private String name;
    private String surname;
    private String sex;
    private int age;
    private int salary;

    public Person(String name, String surname, String sex, int age, int salary) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Person person) {
        //сравниваем по имени
        int resultFirstCompare = this.name.compareTo(person.name);
        if (resultFirstCompare != 0){
            return resultFirstCompare;
        }
        //сравиваем по фамилии
        int resultSecondCompare = this.surname.compareTo(person.surname);
        if (resultSecondCompare != 0){
            return resultSecondCompare;
        }
        //сравниваем по зарплате от большей к меньшей
        else {
            return person.salary - this.salary;
        }
    }
    @Override
    public boolean equals(Object o) {//идентичность
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        //сравниваем по тем же трём параметрам, что в compareTo
        return salary == person.salary && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) ;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, salary);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}