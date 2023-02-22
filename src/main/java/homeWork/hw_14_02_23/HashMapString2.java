package homeWork.hw_14_02_23;
/*todo
    public static String getNewString(String s){
    AAASSDDFFRRTGGBNHYUUU -> 3A2S2D2F2R1T2G1B1N1H1Y3U
    **Добавить проверку- если в строке будут цифра, то вывести
     на экран сообщение "имеются неразрешённые символы"
     добавить метод проверяющий, что в строке нет цифр
    return null;
    }
 */
import java.util.HashMap;
import java.util.Map;

public class HashMapString2 {
    public static void lettersCounter(String[] abc) {
        //Создаем пустую карту, в которую будем записывать результаты
        Map<String, Integer> result = new HashMap<>();
        //Перебираем массив букв
        for (String letter : abc) {
            //Если карта содержит букву, то увеличиваем значение под этой буквой на 1
            if (result.containsKey(letter)) {
                result.put(letter, result.get(letter) + 1);
            }
            //Иначе просто добавляем букву в карту со значением 1
            else {result.put(letter, 1);
            }
        }
        //Выводим карту в консоль
        System.out.println(result);
    }

    public static void main(String[] args) {
        //Объявляем массив и передаём метод
        String[] abc = {"A","A","A","S","S","D","D","F","F","R","R","T","G","G","B","N","H","Y","U","U","U"};
        lettersCounter(abc);
    }
}
