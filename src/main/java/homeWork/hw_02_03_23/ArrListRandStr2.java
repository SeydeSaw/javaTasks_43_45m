package homeWork.hw_02_03_23;

import java.util.ArrayList;
import java.util.Random;

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
public class ArrListRandStr2 {
    public static void main(String[] args) {
        // создание нового объекта класса ArrListRandStr2 и присваивание его переменной stringList
        ArrListRandStr2 stringList = new ArrListRandStr2();
        // вызывается метод generateStr для генерации строк
        stringList.generateStr();
        // вызывается метод printSymb для вывода на консоль символов из заданного индекса
        stringList.printSymb(4);
    }
    ArrayList<String> list = new ArrayList<>();
    public void generateStr() {
        Random random = new Random();
        // генерируем рандомную строку длиной 5
        String randomString = "";
        for (int i = 0; i < 5; i++) {
            randomString += (char) (random.nextInt(26) + 'a');//пояснение функции ниже
        }
        // Добавляем строку в лист
        list.add(randomString);
        // Выводим строку на экран
        System.out.println(list);
    }
    // перебираем по индексу строку с конца и выводим нужный символ, если он есть
    public void printSymb(int index) {
        String str = list.get(list.size() - 1);
        if (index <= str.length() - 1) {
            System.out.println("Символ под индексом " + index + " равен: " + str.charAt(str.length() - index - 1));
        } else {
            System.out.println("Такого символа нет в слове");
        }
    }
}