package homeWork.hw_09_02_23;
/* todo
    Дан массив int[] array = {0,1,5,4,8,9,3,2,6}и число n = 13
    Вывести на экран два любых числа из массива которые в сумме дают n,
    либо вывести на экран, что таких чисел нет
    [0 1 5 4 8 9 3 2 6] n = 13
    ** все пары чисел
 */
public class Array1 {
    public static void main(String[] args) {
        int[] array = {0, 1, 5, 4, 8, 9, 3, 2, 6};  // Создали массив
        int n = 13; // Задали переменную n
        findAllNum(array,n);
    }
    public static void findAllNum(int[] array, int n){
        boolean noPair = true; // Создали переменную для проверки условия наличия пары чисел
        for (int i = 0; i < array.length; i++) { // Проходим по всем элементам массива
            for (int j = 0; j < array.length; j++) { // Проверка каждого элемента массива со всеми последующими
                if (array[i] + array[j] == n) { // Проверяем равна ли сумма двух элементов массива числу n
                    noPair = false; // присвоили переменной noPair значение false, так как нашли пару чисел
                    System.out.println(array[i] + " + " + array[j] + " = " + n); // Выводим эти два элемента на экран
                    break; // выходим из вложенного цикла
                }
            }
        }
        if (noPair) { // Если переменная noPair равна true (т.е. пара чисел не найдены)
            System.out.println("Таких чисел нет!");
        }
    }
}