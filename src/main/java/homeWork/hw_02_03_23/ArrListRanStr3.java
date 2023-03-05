package homeWork.hw_02_03_23;
/*todo Task1
    Написать класс который содержит ArrayList и методы:
    -заполняют лист рандомными цифрами
    -перебирают Итератором и выводят на экран все четные
    -перебирают Итератором и выводят на экран все нечетные
    ---------
    -генерируют рандомную стрингу длиной 5
    -перебирает итератором эту стрингу с конца и
        выводит тот символ который нужен если он есть,
        если нет то выдает сообщение
 */
import java.util.ArrayList;
import java.util.Random;

public class ArrListRanStr3 {

    public static void main(String[] args) {
        // создание нового объекта класса ArrListRandStr и присваивание его переменной stringList
        ArrListRanStr3 stringList = new ArrListRanStr3();
        // вызов метода generateRandomString() для объекта stringList
        stringList.generateRandomString();
        // вызов метода findElementFromEnd() для объекта stringList, ищем в стринге символ, например 'a'
        stringList.findElementFromEnd('a');
    }
    ArrayList<String> stringList = new ArrayList<>();
    public void generateRandomString() {
        Random random = new Random();
        // генерируем стрингу рандомно длинной 5 символов
        String randomString = "";
        for (int i = 0; i < 5; i++) {
            randomString += (char) (random.nextInt(26) + 'a');//пояснение функции ниже
        }
        // добавляем стрингу в лист
        stringList.add(randomString);
        // выводим на экран строку
        System.out.println("Строка : " + randomString);
    }
    public void findElementFromEnd(char elem) {
        // перебираем все элементы в списке
        for (String element : stringList) {
            // перебираем строку с конца
            for (int i = element.length() - 1; i >= 0; i--) {
                // если символ совпадает с искомым
                if (element.charAt(i) == elem) {
                    System.out.println("Найден символ " + elem + " в строке: " + element);
                    return;
                }
            }
        }
        System.out.println("Символ '" + elem + "' не присутствует в строке.");
    }
}