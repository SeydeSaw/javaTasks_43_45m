package lessons._11_mai_2023;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_11_mai_2023 {
/* TODO: 11.05.23
        1. Выбрать 4 задачи которые вы писали
        (вынести их в отдельный класс и каждую задачу в отдельный метод)
        (если ваш метод выбрасывает исключение или может его выбросить - прописать это в коде)
        2. Если в методе нет возвращаемого значения, то сделать его
        3. Протестировать это все дело.
 */

    public int transpose(int[][] matrix) {
        if (matrix == null) {
            throw new NullPointerException();
        }
        int sum = 0;
        int[][] reverseMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                reverseMatrix[i][j] = matrix[j][i];
                if (i == j) {
                    sum = reverseMatrix[i][j] + sum;
                }
                //System.out.println("строка " + i + " элемент " + reverseMatrix[i][j] + " ");
            }
            System.out.println(" ------- ");
            System.out.println(sum);
        }
        for (int i = 0; i < reverseMatrix.length; i++) {
            for (int j = 0; j < reverseMatrix[i].length; j++) {
                System.out.print(Arrays.toString(reverseMatrix[i]));
                System.out.println();
            }
        }
        //System.out.println("Сумма елементов по диагонали " + sum);
        return sum;
    }

    public int[][] transpose2(int[][] matrix) {

        int rows = matrix.length;
        int colums = matrix[0].length;
        int[][] transposedMatrix = new int[colums][rows];

        if(colums != rows){
            throw new IllegalStateException();
        }

        if(matrix == null){
            throw new NullPointerException();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    public boolean isMono(int[] array) {
        if (array==null){
            throw new NullPointerException();
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[0] < array[array.length - 1]) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
            }
        }
        for (int i = array.length - 1; i > 0; i--) {
            if (array[0] > array[array.length - 1]) {
                if (array[i] > array[i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public String containsOnlyDigits(String[] array) {
        String[] strings = {"abc", "123", "456def", "789ghi"};
        for (String str : array) {
            if (str.matches("\\d+")) {
                return str;
            }
        }
        return null;
    }

    public String replaceWord(String text, String from, String to) {
        return text.replaceAll(from, to);
    }

    public List<String> getWordsStartingWithLetter(List<String> strings, char letter) {
        return strings.stream()
                .flatMap(str -> Arrays.stream(str.split("\\s+")))
                .filter(word -> !word.isEmpty() && word.charAt(0) == letter)
                .distinct()
                .collect(Collectors.toList());
    }
}