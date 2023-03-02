package homeWork.hw_23_02_23;

import java.util.Random;
import java.util.Scanner;

/*todo Task 1
    Дан двумерный массив, который состоит из 0 и 1.
    Единица, которая окружена нулями (сверху, справа, снизу и слева), называется островом.
    Создать метод, который будет рандомно заполнять двумерный массив,
    создать метод который подсчитывает количество отстравов ,
    создать метод, который найдёт остров с наибольшей площадью.
 */
public class Island {

    public static void main(String[] args) {
        //создаем объект для считывания с клавиатуры
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк массива:");
        //считываем количество строк с клавиатуры
        int row = scanner.nextInt();
        System.out.println("Введите количество столбцов массива:");
        //считываем количество столбцов с клавиатуры
        int col = scanner.nextInt();

        //создаем двумерный массив с размером row на col
        int[][] array = new int[row][col];

        fillArray(array); //вызываем метод для заполнения двумерного массива случайными числами

        printArray(array);// Вывести массив на экран

        System.out.println("Количество островов: " + countIslands(array));//вызываем метод для подсчета количество островов и выводим его на экран
    }

    //метод для заполнения двумерного массива случайными числами
    public static void fillArray(int[][] arr) {
        // Создать объект класса Random
        Random random = new Random();

        // Заполнить массив случайными значениями 0 и 1
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(2);
            }
        }
    }

    // Метод ля вывода массива на экран
    public static void printArray(int[][] arr) {
        // Вывести массив на экран
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //метод для подсчета количество островов
    public static int countIslands(int[][] arr) {
        // Подсчитать количество островов
        int numOfIslands = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    // Если элемент равен 1 и он окружен нулями, то это остров
                    if (isIsland(arr, i, j)) {// В этом случае вызывается метод isIsland и передаются в него параметры - двумерный массив, индексы строки и столбца элемента массива
                        numOfIslands++;//Если результат вызова метода будет true, то переменная numOfIslands увеличивается на 1.
                    }
                }
            }
        }
        return numOfIslands;
    }

    // метод,который принимает массив и индексы строки и столбца элемента массива
    public static boolean isIsland(int[][] arr, int i, int j) {
        // Если элемент равен 1 и он окружен нулями, то это остров
        if (i > 0 && arr[i - 1][j] == 0) {//Проверка соседнего элемента слева от исследуемого
            if (i < arr.length - 1 && arr[i + 1][j] == 0) {//Проверка соседнего элемента справа от исследуемого
                if (j > 0 && arr[i][j - 1] == 0) {//Проверка соседнего элемента сверху от исследуемого
                    if (j < arr[i].length - 1 && arr[i][j + 1] == 0) {//Проверка соседнего элемента снизу от исследуемого
                        return true;// Если все соседние элементы равны нулю, то возвращается true
                    }
                }
            }
        }
        return false;//Если не все соседние элементы равны нулю, то возвращается false
    }
}