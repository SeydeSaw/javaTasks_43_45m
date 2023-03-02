package lessons._28_feb_23;
import java.util.ArrayList;
import java.util.List;

public class ListAdd {
/*todo 01.03.23
    Написать метод который добавляет в лист 1000 слов
 */

    public static void main(String[] args) {
        // Создаем лист
        List<String> list = new ArrayList<>();//объявление нового объекта типа ArrayList, который хранит список строк
                                             //Квалификатор <> указывает на то, что мы используем тип параметризации,
                                            //поэтому список будет содержать только элементы типа String
        // Вызываем метод
        addWordsToList(list);
    }
    // Метод для добавления слов в лист
    private static void addWordsToList(List<String> list) {//метод принимает аргумент в виде списка(коллекции) строк
        // Добавляем 1000 слов в лист
        for (int i = 1; i < 1001; i++) {
            list.add("word " + i);//оператор, который добавляет строку "word" + значение переменной i в список
        }
        System.out.println(list);
    }
}