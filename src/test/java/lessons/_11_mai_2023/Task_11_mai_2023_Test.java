package lessons._11_mai_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_11_mai_2023_Test {

    private static final int[][] nullArray = null;
    private final Task_11_mai_2023 task = new Task_11_mai_2023();

    @Test
    void transposePositiveTest() {
        int[][] arr = new int[][]{{123}, {456}, {789}};
        int expectedSum = 123;
        int actualSum = this.task.transpose(arr);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void transposeNegativeTest() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            this.task.transpose(nullArray);
        });
    }

    @Test
    void transpose2PositiveTest() {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] actual = this.task.transpose2(arr);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void transpose2NegativeTest() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            this.task.transpose2(nullArray);
        });
    }

    @Test
    void isMonoTest() {
        int[] arrIsMonoTrue = new int[]{1, 3, 4, 5, 6, 7};
        int[] arrIsMonoFalse = new int[]{1, 2, 3, 4, 5, 3, 7, 5};
        Assertions.assertTrue(this.task.isMono(arrIsMonoTrue));
        Assertions.assertFalse(this.task.isMono(arrIsMonoFalse));
    }

    @Test
    void isMonoTestArrayNullNegative() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            this.task.isMono((int[])null);
        });
    }

    @Test
    void containsOnlyDigitsTest() {
        String[] input = new String[]{"abc", "123", "456def", "789ghi"};
        String expectedOutput = "123";
        String actualOutput = this.task.containsOnlyDigits(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void containsOnlyDigitsTestNegative() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            this.task.containsOnlyDigits((String[])null);
        });
    }

    @Test
    void replaceWordTest() {
        String text = "Этот текст содержит ???";
        String from = "\\?\\?\\?";
        String to = "вырезано цензурой";
        String expectedText = "Этот текст содержит вырезано цензурой";
        String actualText = this.task.replaceWord(text, from, to);
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    void replaceWordTestNegative() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            this.task.replaceWord((String)null, (String)null, (String)null);
        });
    }
}