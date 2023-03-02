package lessons._28_feb_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PalindromeChecker {

    public static void main(String[] args) {

        List<String> palindromeList = new ArrayList<>();
        List<String> nonPalindromeList = new ArrayList<>();
        fillListRandomly(palindromeList, nonPalindromeList);

        System.out.println("Palindrom words:");
        for (String palindrome : palindromeList) {
            System.out.println(palindrome + " is a palindrome: " + isPalindrome(palindrome));
        }

        System.out.println("Non palindrom words:");
        for (String nonPalindrome : nonPalindromeList) {
            System.out.println(nonPalindrome + " is a palindrome: " + isPalindrome(nonPalindrome));
        }
    }

    private static void fillListRandomly(List<String> palindromeList, List<String> nonPalindromeList) {
        String[] palindromeWords = {"kayak", "level", "radar", "civic", "refer", "rotor", "madam", "solos", "stats", "tenet"};
        String[] nonPalindromeWords = {"apple", "orange", "banana", "mango", "grape", "strawberry", "pear", "lemon", "avocado", "kiwi"};

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            palindromeList.add(palindromeWords[random.nextInt(palindromeWords.length)]);
            nonPalindromeList.add(nonPalindromeWords[random.nextInt(nonPalindromeWords.length)]);
        }
    }
    private static boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;

        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}