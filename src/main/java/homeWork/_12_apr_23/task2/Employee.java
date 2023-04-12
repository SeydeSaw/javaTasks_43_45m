package homeWork._12_apr_23.task2;
/* TODO: 12.04.23
    	•	СОТРУДНИКИ
	    •	Есть иерархия сотрудников
	    •	менеджеры, мидлы, джуны, сеньоры, тим лиды, CTO
	    •	написать класс который хранит только этот тип данных
	    •	Результат:класс<>-коллекция должен хранить только неповторяющихся
	    •	сотрудников в отсортированном виде
	    •	у класса должны быть методы add, delete, search
 */

public class Employee<T> implements Comparable<T> {
    private String name;
    private String surname;
    private int salary;

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(T o) {
        Employee employee = (Employee) o;
        if(this.name.compareTo(employee.name) != 0){
            return this.name.compareTo(employee.name);
        }
        if(this.surname.compareTo(employee.surname) != 0){
            return this.surname.compareTo(employee.surname);
        }
        return this.salary - employee.salary;
    }

    @Override
    public String toString() {
        return
                "Name:'" + name + '\'' +
                ", Surname:'" + surname + '\'' +
                ", Salary: " + salary +
                '}' + "\n";
    }
}
