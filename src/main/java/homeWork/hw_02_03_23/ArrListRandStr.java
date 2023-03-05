package homeWork.hw_02_03_23;
/* todo Task1
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
import java.util.ListIterator;
import java.util.Random;

public class ArrListRandStr {
    public static void main(String[] args) {
        // создание нового объекта класса ArrListRandStr и присваивание его переменной stringList
        ArrListRandStr stringList = new ArrListRandStr();
        // вызов метода generateRandomString() для объекта stringList
        stringList.generateRandomString();
        // вызов метода findSymbolFromEnd() для объекта stringList
        stringList.findSymbolFromEnd();
    }
    ArrayList<String> list = new ArrayList<>();
    public void generateRandomString() {
        Random random = new Random();
        // генерируем стрингу рандомно длинной 5 символов
        String randomString = "";
        for (int i = 0; i < 5; i++) {
            randomString += (char) (random.nextInt(26) + 'a');
        }
        // добавляем стрингу в лист
        list.add(randomString);
        // выводим на экран строку
        System.out.println("Строка : " + randomString);
    }

    public void findSymbolFromEnd() {
        // итератор для перебора элементов списка с конца
        ListIterator<String> listIterator = list.listIterator(list.size());
        // цикл для перебора элементов списка с конца при помощи итератора
        while (listIterator.hasPrevious()){
            // присваивается переменной текущий элемент списка
            String elementString = listIterator.previous();
            // присваивается переменной символ, находящийся в конце текущей строки
            char symbol = elementString.charAt(elementString.length()-1);
            // выводится символ на экран
            System.out.println("Последний символ строки: " + symbol);
        }
    }
}
