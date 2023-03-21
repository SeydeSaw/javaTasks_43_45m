package lessons._21_mar_23;
//todo 3. Класс Эплои с полями имя позраст зарплата и рейтинг

import java.util.List;

public class Employe implements Comparable<Employe>{
    private String name;
    private String surname;
    private int age;
    private int sallary;
    private Rating rating;
    private Department department;

    public Employe(String name, String surname, int age, int sallary, Rating rating, Department department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sallary = sallary;
        this.rating = rating;
        this.department = department;
    }

    public Employe(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSallary() {
        return sallary;
    }

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public int compareTo(Employe employe) {
        int resultFistCompare = this.name.compareTo(employe.name);
        if(resultFistCompare != 0){
            return resultFistCompare;
        }
        int resultSecondCompare = this.surname.compareTo(employe.surname);
        if(resultSecondCompare != 0){
            return resultSecondCompare;
        }
        int resultThirdCompare = this.department.compareTo(employe.department);
        if(resultThirdCompare != 0){
            return resultThirdCompare;
        }
        else {
            return this.sallary == employe.sallary ? this.age - employe.age : this.sallary - employe.sallary;
        }
    }
}
