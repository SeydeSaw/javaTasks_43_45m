package lessons._14_mar_23;

import java.util.*;

/*
Написать метод, который заполняет Set рандомными числа до 22
размер Set 33
написать
    - далее если размер после заполнения не 22 снова заполняет рандомными числами
    - метод который находит максимальное, минимальное и среднее знчение
    - ** который возвращает List состящий из простых чисел
 */
public class Task1 {

    public static void main (String[] args) {
        Set<Integer> numSet = new HashSet<>();
        fillSetRandom(numSet);
        System.out.println("Max num: " + findMaxNumber(numSet));
        System.out.println("Min num: " + findMinNumber(numSet));
        System.out.println("Average num: " + findAverageNumber(numSet));
        System.out.println("Simple numbers: " + getSimpleNumbers(numSet));
    }

    public static void fillSetRandom(Set<Integer> numSet) {
        Random random = new Random();
        while (numSet.size() != 22) {
            numSet.add(random.nextInt(33));
        }
    }

    public static int findMaxNumber(Set<Integer> numSet) {
        int max = 0;
        for (Integer number : numSet) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findMinNumber(Set<Integer> numSet) {
        int min = numSet.iterator().next();
        for (Integer number : numSet) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static double findAverageNumber(Set<Integer> numSet) {
        int sum = 0;
        for (Integer number : numSet) {
            sum += number;
        }
        return (double) sum / numSet.size();
    }

    public static List<Integer> getSimpleNumbers(Set<Integer> numSet) {
        List<Integer> simpleNumbers = new ArrayList<>();// создается лист, в который будут добавляться простые числа
        for (Integer num : numSet) {// проходится по всем числам, которые были сгенерированы ранее
            if (num > 1) {
                boolean isSimple = true;// предполагается, что число простое
                for (int j = 2; j < num; j++) {// проходится по диапазону от 2 до данного числа
                    if (num % j == 0) {//если остаток от деления равен нулю
                        isSimple = false;//число не простое
                        break;
                    }
                }
                if (isSimple) { // если число простое, то
                    simpleNumbers.add(num); // добавляется в лист с результатом
                }
            }
        }
        return simpleNumbers; // возвращается лист с простыми числами
    }
}