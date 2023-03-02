package homeWork.hw_23_02_23;

import java.util.Scanner;

/*todo Task2
    Создать неравномерный массив (Массив ёлочка).
    Высота int h = передаём с консоли, по бокам заполнить 1,
    далее внутри массив заполняется суммой верхних чисел.
    Треугольник Паскаля
 */
public class Triangle {
    public static void main(String[] args) {
        //создаем объект для считывания с клавиатуры
        Scanner scanner = new Scanner(System.in);
        //сообщаем пользователю с каким заданием он имеет дело
        System.out.println("Введите высоту треугольника:");
        //считываем значение высоты треугольника с клавиатуры
        int h = scanner.nextInt();
        //создаем двумерный массив с размером h на h
        int[][] arr = new int[h][h];
        //заполняем рамку массива единицами
        for (int i = 0; i < h; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        //находим значения внутри массива, суммируя значения верхних элементов
        for (int i = 2; i < h; i++) {
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        //выводим массив на экран
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}