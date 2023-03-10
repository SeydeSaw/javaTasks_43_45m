package lessons._21_feb_23;

import java.util.LinkedList;
import java.util.List;

public class Dividing {
    //  125 126 127 128 129 130 131 132 133 -----  256
    public static List<Integer> selfDiv(int first, int last) {
        //создается пустой объект списка целых чисел с именем list
        List<Integer> list = new LinkedList<>();
        //переменная i устанавливается равной значению аргумента first
        //выполняется цикл с проверкой условия сравнения значения i с значением аргумента last
        for (int i = first; i <= last; i++) {
            //внутри цикла создается переменная j устанавливаемая равной значению переменной i
            int j = i;
            //внутри цикла используется вложенный цикл с проверкой условия сравнения значения j с 0
            for (; j > 0; j /= 10) {
                //внутри вложенного цикла проверяется условие, деления значения j на 10 на остаток равным 0
                //деления значения i на остаток от деления значения j на 10 на остаток не равным 0
                if ((j % 10 == 0) || (i % (j % 10) != 0)) {
                    break;
                }
            }
            //если значение j равно 0, то значение i добавляется в список list
            if(j == 0) {
                list.add(i);
            }
        }
        //возвращается список list
        return list;
    }

    public static void main(String[] args) {
        System.out.println(selfDiv(121, 299));
    }
}