package lessons._21_mar_23;

import java.util.List;

/* TODO: 21.03.23
    1. class Company имя и лист департаментов
    2. Энам Департаменты с 5 макисмум департаментами
    3. Класс Эплои с полями имя позраст зарплата и рейтинг
    4. Энам рейтинг
    если рейтинг A то +20%
    B +15%
    C +5%
    D 0%
    E -5%
    5. Класс генератор который создает Эмплои и
    засовывет его в рандомный департамент с рандомным рейтингом и зарплатой
    Эмплои должен иметьспособность сравниматься по всем полям кроме ретинга
    6. Сделать отдельный компаратор который сортирует по рейтингу
    7. В классе Мэйн надо прописать только один метод с параметрок
    количеством сотрудников который с генерирует весь этот процесс
    и выведет на экран Сотрудника с зп ДО и После
    *Повышать зп надо пройдясь по лситу сотрудников итератором
 */
public class Company {
    private String name;
    private List<Department> departmens;

    public Company(String name, List<Department> departmens) {
        this.name = name;
        this.departmens = departmens;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartmens() {
        return departmens;
    }

    public void setDepartmens(List<Department> departmens) {
        this.departmens = departmens;
    }
}
