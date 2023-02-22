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

public class HashMapString {
    public static void main(String[] args) {
        String[] abc = {"A","A","A","S","S","D","D","F","F","R","R","T","G","G","B","N","H","Y","U","U","U"};
        //Создаем Map для подсчета количества букв
        Map<String, Integer> lettersMap = new HashMap<>();
        //Перебираем массив и добавляем букву в Map
        for (String letter : abc) {
            //инкрементируем значение на 1, если буква уже есть в Map
            Integer amount = lettersMap.get(letter);
            if (amount == null) {
                lettersMap.put(letter, 1);
            } else {
                lettersMap.put(letter, amount + 1);
            }
        }
        //Выводим результат
        System.out.println(lettersMap);
    }
}
