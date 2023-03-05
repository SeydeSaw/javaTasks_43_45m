package homeWork.hw_02_03_23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

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
public class ArrListRandInt {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillListRandom(list);
        System.out.println("Even numbers: ");
        printEven(list);
        System.out.println("Odd numbers: ");
        printOdd(list);
    }
    // метод для заполнения списка случайными цифрами
    public static void fillListRandom(ArrayList<Integer> list){
        Random random = new Random();
        for (int i = 0; i < 10; i++){//создание цикла с итерацией от 0 до 10
            list.add(random.nextInt(100));//добавление в лист случайного числа в диапазоне от 0 до 100
        }
    }
    // метод для перебора списка и вывода на экран всех четных цифр
    public static void printEven(ArrayList<Integer> list){
        //создается объект итератора для перебора элементов массива
        Iterator<Integer> iterator = list.iterator();
        //выполняется цикл пока итератор имеет следующий элемент
        while (iterator.hasNext()){
            //переменная num присваивается следующему элементу итератора
            int num = iterator.next();
            //проверяется является ли число четным
            if (num % 2 == 0) {
                //если четное то выводится на печать с пробелом
                System.out.print(num + " ");
            }
        }
        //после перебора всех элементов массива выводится пустая строка
        System.out.println();
    }
    // метод для перебора списка и вывода на экран всех нечетных цифр
    public static void printOdd(ArrayList<Integer> list){
        //создается объект итератора для перебора элементов массива
        Iterator<Integer> iterator = list.iterator();
        //выполняется цикл пока итератор имеет следующий элемент
        while (iterator.hasNext()){
            //переменная num присваивается следующему элементу итератора
            int num = iterator.next();
            //проверяется является ли число нечетным
            if (num % 2 ==1) {
                //если нечетное то выводится на печать с пробелом
                System.out.print(num + " ");
            }
        }
        //после перебора всех элементов массива выводится пустая строка
        System.out.println();
    }
}