package homeWork._12_apr_23.task2;

import java.util.TreeSet;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Anna", "Annova", 2000);
        Employee emp2 = new Employee("Boris", "Lebedev", 3000);
        Employee emp3 = new Employee("Elena", "Lebedeva", 10000);
        Employee emp4 = new Employee("Maksim", "Petrov", 1000);
        Employee emp5 = new Employee("Maksim", "Petrov", 7000);
        Employee emp6 = new Employee("Alisa", "Lisova", 9000);
        Employee emp7 = new Employee("Pavel", "Pavlov", 4000);
        Employee emp8 = new Employee("Maksim", "Petrov", 1000);

        TreeSet<Employee> junior = new TreeSet<>();
        TreeSet<Employee> middle = new TreeSet<>();
        TreeSet<Employee> senior = new TreeSet<>();
        TreeSet<Employee> teamLead = new TreeSet<>();

        // Добавление сотрудников в соответствующую группу
        Staff<Employee> staff = new Staff<>(junior, middle, senior, teamLead);
        staff.addEmployee(emp1);
        staff.addEmployee(emp2);
        staff.addEmployee(emp3);
        staff.addEmployee(emp4);
        staff.addEmployee(emp5);
        staff.addEmployee(emp6);
        staff.addEmployee(emp7);
        staff.addEmployee(emp8);

        // Вывод исходных данных на экран
        System.out.println("Junior employees: \n" + junior + "\n");
        System.out.println("Middle employees: \n" + middle + "\n");
        System.out.println("Senior employees: \n" + senior + "\n");
        System.out.println("TeamLead employees: \n" + teamLead + "\n");

        // Удаление сотрудника emp2 из группы
        staff.removeEmployee(emp2);
        System.out.println("Employee removed from list: " + emp2);
    }
}
