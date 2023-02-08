package homeWork.hw_07_02_23;
/*Todo
    Дан массив int[], надо:
       - заполнить массив числами Фибоначчи
                    ******
    "Числа Фибоначчи — бескочечная числовая последовательность ,
    в которой каждое число есть сумма двух предыдущих:
    F n = F n − 1 + F n − 2 .
    Первые два элемента последовательности,
    нужные для затравки — ноль и единица: F 0 = 0 , F 1 = 1 ."
 */

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

    public static void main(String[] args){
        //создаём сканнер для ввода с консоли:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        //объявляем массив:
        int[] array = new int[scanner.nextInt()];
        //обращаемся к методу и передаём массив:
        fillFibonacci(array);
    }
    public static void fillFibonacci(int[] array){
        // первые два элемента массива соответствуют начальным значениям
        // последовательности чисел Фибоначчи:
        array[0] = 0; //F 0 = 0
        array[1] = 1; //F 1 = 1
        // заполняем массив числами Фибоначчи:
        for (int i = 2; i < array.length; i++){
            // предыдущие два элемента массива складываем и
            // получаем следующее значение последовательности
            // F n =    F n − 1   +  F n − 2:
            array[i] = array[i-1] + array[i-2];
        }
        //Вывести массив на экран:
        System.out.println("Массив заполненный числами Фибоначчи: " + "\n" + (Arrays.toString(array)));
        // \n  для перехода на следующую строку при выводе на экран
    }
}