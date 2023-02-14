package homeWork.hw_09_02_23;
/*todo
    Дан массив int[] array = {0,1,5,4,8,9,3,2,6}.
    необходимо проверить массив на наличие повторений чисел,
    если есть одинаковые числа, то вывести их на экран
 */
import java.util.Arrays;

public class ArrSort {
    public static void main(String[] args) {
        int[] array = {0,1,5,5,88,9,3,2,6,7,45,9,0,88};
        Arrays.sort(array); // сортируем массив
        for (int i = 0; i < array.length - 1; i++) { // проходим по массиву для поиска повторов
            if (array[i] == array[i + 1]) { // сравниваем подряд идущие элементы
                System.out.println("Повторяющееся число: " + array[i]); // выводим повторяющиеся элементы на экран
            }
        }
    }
}