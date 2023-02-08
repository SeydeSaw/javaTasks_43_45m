package _07_feb_23;
/*TODO
       Написать метод, который проходит по массиву
       Считает сумму первого и последнего элемента,
       второго и предпоследнего и так попорядку
       до середины массива

 */
import java.util.Arrays;

public class Test1 {

        private static void sum(int[] arr) {

            //создаём стартовую переменную:
            int start = 0;
            //создаём конечную переменную:
            int end = arr.length - 1;

            int sum = 0;

            //пока (start не равен  end)
            while (start != end) {
                sum = sum + (arr[start] + arr[end]);
                start++;//двигаем на 1 вперёд
                end--;//двигаем на 1 назад
            }
            //когда поравняются:
            if (start == end) {
                sum += arr[start];
            }
            System.out.println(sum);
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 6, 3, 2};
            //вызываем метод sum и передаём туда массив:
            sum(arr);
        }
}