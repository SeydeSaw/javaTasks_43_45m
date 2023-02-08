package homeWork.hw_07_02_23;
/*
Todo
    Дан массив int[], надо:
    - если массив длиной больше чем 4, то
    найти 3тий и 4тый по минимальности элементы
    - если массив меньше 4, то сообщение, что массив меньше
 */
import java.util.Arrays;

public class Array1 {

    public static void main(String[] args) {
        int[]arr = {2,44,3,4,7,9,66,};
        findElements(arr);
    }
    public static void findElements(int[] arr) {
        //проверяем длину массива:
        if (arr.length > 4) {
            // Сортируем массив по возрастанию:
            Arrays.sort(arr);
            // Выводим на экран третий и четвертый элементы массива:
            System.out.println("Третий минимальный элемент: " + arr[2]);
            System.out.println("Четвёртый минимальный элемент: " + arr[3]);
        } else {
            System.out.println("Длина массива меньше 4");
        }
    }
}