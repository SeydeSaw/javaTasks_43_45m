package homeWork.hw_14_02_23;
/*todo
    public static String getNewString(String s){
    AAASSDDFFRRTGGBNHYUUU -> 3A2S2D2F2R1T2G1B1N1H1Y3U
    **Добавить проверку- если в строке будут цифра, то вывести
     на экран сообщение "имеются неразрешённые символы"
     добавить метод проверяющий, что в строке нет цифр
    return null;
    }
 */

import java.util.Arrays;

public class WorkWithString {

    public static void main(String[] args) {
        String[] abc = {"A","A","A","S","S","D","D","F","F","R","R","T","G","G","B","N","H","Y","U","U","U"};
        //создаем пустой массив результата
        int[] result = new int[abc.length];
        //идем по первому массиву
        for (int i = 0; i < abc.length; i++) {
            //счетчик для повторяющихся букв
            int count = 0;
            //сравниваем текущий элемент с остальными
            for (int j = 0; j < abc.length; j++) {
                //сравниваем два элемента массива
                if (abc[i] == abc[j]) {
                    //увеличиваем счетчик
                    count++;
                }
            }
            //записываем результат в новый массив
            result[i] = count;
        }
        //выводим результат
        for (int i = 0; i < abc.length; i++) {
            System.out.println("Буква " + abc[i] + " повторяется " + result[i] + " раз.");
        }
    }
}
