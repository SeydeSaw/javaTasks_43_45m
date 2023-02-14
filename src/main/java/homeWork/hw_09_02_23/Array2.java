package homeWork.hw_09_02_23;

/*todo
    Дан массив int[] array = {0,1,5,4,8,9,3,2,6}.
    необходимо проверить массив на наличие повторений чисел,
    если есть одинаковые числа, то вывести их на экран
 */

public class Array2 {
    public static void main(String[] args) {
        int[] array = {0, 1, 5, 5, 8, 9, 3, 2, 6,6};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Повторяющееся число: " + array[i]);
                }
            }
        }
    }
}