package homeWork.hw_16_02_23;
/*todo 4
    Написать метод который
    генерирует двумерный массив длиной N и высотой H
    Далее заполняет получившийся массив числами от 1 до W
    по спирали.
    Например массив [ ][ ][ ][ ]
                    [ ][ ][ ][ ]
                    [ ][ ][ ][ ]
    имеет N == 4 and H == 3 и вид [ 1 ][ 2 ][ 3 ][ 4 ]
                                  [10][11][12 ][ 5 ]
                                 [ 9 ][ 8 ][ 7 ][ 6 ]
 */
public class SpiralArray {
    public static void main(String[] args) {
        int[][] array = getSpiralArray(4, 3, 12);
    }
    public static int[][] getSpiralArray(int N, int H, int W) {
        // Создаем двумерный массив
        int[][] array = new int[N][H];
        // Создаем три переменные для подсчета.
        int top = 0, bottom = N - 1, left = 0, right = H - 1;
        int count = 1;
        // Запускаем цикл, пока переменные top и left не станут равными правой и нижней границе массива
        while (top <= bottom && left <= right) {
            // Заполняем верхнюю строку массива числами от 1 до W
            for (int i = left; i <= right; i++) {
                array[top][i] = count++;
            }
            top++;
            // Заполняем правую колонку массива числами от 1 до W
            for (int i = top; i <= bottom; i++) {
                array[i][right] = count++;
            }
            right--;
            // Заполняем нижнюю строку массива числами от 1 до W в обратном направлении
            for (int i = right; i >= left; i--) {
                array[bottom][i] = count++;
            }
            bottom--;
            // Заполняем левую колонку массива числами от 1 до W в обратном направлении
            for (int i = bottom; i >= top; i--) {
                array[i][left] = count++;
            }
            left++;
        }
        // Выводим массив на консоль
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < H; j++) {
                System.out.print(array[i][j] + "\t");//\t для красивого вывода чисел
            }
            System.out.println();
        }
        return array;
    }
}