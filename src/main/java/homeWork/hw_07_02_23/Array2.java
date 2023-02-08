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

public class Array2 {

    public static void main(String[] args){
    //объявляем массив:
    int[] array = new int[10];
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
        System.out.println(Arrays.toString(array));
    }
}