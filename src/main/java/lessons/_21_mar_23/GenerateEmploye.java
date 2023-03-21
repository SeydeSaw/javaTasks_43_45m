package lessons._21_mar_23;

/*todo
    5. Класс генератор который создает Эмплои и
    засовывет его в рандомный департамент с рандомным рейтингом и зарплатой
    Эмплои должен иметь способность сравниваться по всем полям кроме ретинга

 */
public class GenerateEmploye {
    public static void main(String[] args) {
        Employe P1 = new Employe("Anna", "Annova", 30);
        Employe P2 = new Employe("Elena", "Lenova", 33);
        Employe P3 = new Employe("Anton", "Antonov", 38);
        Employe P4 = new Employe("Rita", "Ritova", 38);
        Employe P5 = new Employe("Anna", "Antonova", 20);
        Employe P6 = new Employe("Pavel", "Pavlov", 29);
    }

}
