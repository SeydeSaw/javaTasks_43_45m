package lessons._28_feb_23;

import java.util.ArrayList;
import java.util.List;

public class PalindromeList {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        fillListWithWords(words);
        checkListForPalindrome(words);
    }

    // заполняем список словами - 10 палиндромных и 10 не палиндромных
    public static void fillListWithWords(List<String> list) {
        list.add("racecar");
        list.add("level");
        list.add("hannah");
        list.add("good");
        list.add("madam");
        list.add("civic");
        list.add("kayak");
        list.add("refer");
        list.add("rotator");
        list.add("solos");
        list.add("apple");
        list.add("banana");
        list.add("carrot");
        list.add("dragon");
        list.add("elephant");
        list.add("flower");
        list.add("giraffe");
        list.add("hippo");
        list.add("iguana");
    }

    // проверяем каждое слово списка на палиндром
    public static void checkListForPalindrome(List<String> list) {
        for (String word : list) {
            boolean isPalindrome = isPalindrome(word);
            System.out.println(word + " is palindrome: " + isPalindrome);
        }
    }

    // проверка слова на палиндром
    public static boolean isPalindrome(String word) {
        String reverseWord = new StringBuilder(word).reverse().toString();
        return word.equals(reverseWord);
    }
}