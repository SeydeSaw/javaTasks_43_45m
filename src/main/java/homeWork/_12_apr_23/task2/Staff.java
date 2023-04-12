package homeWork._12_apr_23.task2;

import java.util.TreeSet;

public class Staff<T> {

    private TreeSet<T> junior;
    private TreeSet<T> middle;
    private TreeSet<T> senior;
    private TreeSet<T> teamLead;

    public Staff(TreeSet<T> junior, TreeSet<T> middle, TreeSet<T> senior, TreeSet<T> teamLead) {
        this.junior = junior;
        this.middle = middle;
        this.senior = senior;
        this.teamLead = teamLead;
    }

    public boolean removeEmployee(T employee) {
        if (junior.contains(employee)) {
            junior.remove(employee);
            return true;
        }
        if (middle.contains(employee)) {
            middle.remove(employee);
            return true;
        }
        if (senior.contains(employee)) {
            senior.remove(employee);
            return true;
        }
        if (teamLead.contains(employee)) {
            teamLead.remove(employee);
            return true;
        }
        return false;
    }

    public void addEmployee(T employee) {
        if (employee instanceof Employee) {// Проверяем, является ли переданный параметр экземпляром класса Employee
            Employee emp = (Employee) employee;// Если да, то присваиваем переменной emp экземпляр класса Employee и проверяем зарплату
            if (emp.getSalary() < 2000) {
                junior.add(employee);
                return;
            }
            if (emp.getSalary() >= 2000 && emp.getSalary() < 5000) {
                middle.add(employee);
                return;
            }
            if (emp.getSalary() >= 5000 && emp.getSalary() < 10000) {
                senior.add(employee);
                return;
            }
            if (emp.getSalary() >= 10000) {
                teamLead.add(employee);
            }
        }
    }

}