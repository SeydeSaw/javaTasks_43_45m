package homeWork.hw_02_03_23;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ArrListStrRand {
    // private static ArrayList<Character> list = new ArrayList<>();
    public static void main(String[] args) {
        String str = generateRandomString();
        System.out.println(str);
        char x = 'a';
        findSymbolFromEnd(str, x);
    }
    public static String generateRandomString() {
        Random random = new Random();
        // генерируем стрингу рандомно длинной 5 символов
        String randomString = "";
        for (int i = 0; i < 5; i++) {
            randomString += (char) (random.nextInt(26) + 'a');
        }
        return randomString;
    }
    public static void findSymbolFromEnd(String s, char x) {
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        //создается объект итератора для перебора элементов
        ListIterator<Character> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            char elementString = listIterator.previous();
            if (x == elementString) {
                System.out.println("Символ " + elementString + " найден в строке");
                return;
            }
        }
        System.out.println("Символ не найден в строке");
    }
}