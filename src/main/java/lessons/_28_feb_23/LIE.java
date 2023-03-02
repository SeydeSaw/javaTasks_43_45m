package lessons._28_feb_23;

import java.util.*;

public class LIE {
    //Метод, который генерит слова заглавными буквами,
    //используя 5 букв
    //Написать метод который добавляет в лист 1000 слов
    //Написать метод который принимает Лист и проверяет каждое слово
    //на палиндром
    //Вывод на экран СЛОВО : Палиндром/НЕ Палиндром
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("m");
        listString.add("a");
        listString.add("d");
        listString.add("a");
        listString.add("m");
        System.out.println(changeToUp(listString));

        //String s = "MADAM";
        //вызываем метод и передаём в него строку, выводим на экран
        System.out.println(findPalindrome("MADAM"));
    }
    public static List<String> changeToUp(List<String> list) {

        for (int i = 0; i < list.size(); i++)
            list.set(i, list.get(i).toUpperCase());

        return list;
    }
    private static boolean findPalindrome(String s){

        List<Character> characters = new LinkedList<>();
        for(char c : s.toCharArray()) {
            characters.add(c);
        }
        boolean isPalindrome = true;

        ListIterator<Character> listIteratorStart = characters.listIterator();
        //  while (listIteratorStart.hasNext()){//пока есть следующий элемент
        //  System.out.println(listIteratorStart.next());
        //  }
        ListIterator<Character> listIteratorEnd = characters.listIterator(characters.size());
        //  while (listIteratorEnd.hasPrevious()){
        //  System.out.println(listIteratorEnd.previous());
        //  }
        while (listIteratorStart.hasNext() && listIteratorEnd.hasPrevious()){
            if (listIteratorStart.next() != listIteratorEnd.previous()) {
                System.out.println("Is not Palindrome");
                isPalindrome = false;
                break;//если хоть одно несовпадение, то прерываем цикл
            }
        }
        return isPalindrome;
    }
}