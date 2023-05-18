package challenges;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert word to analyze: ");
        String word = scanner.nextLine();
        boolean result = isPalindrome(word);

        System.out.println(result ? "is palindrome" : "not palindrome");
    }
    public static boolean isPalindrome(String word) {
        char[] backwardsWord = new char[word.length()];
        char[] wordChar = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            backwardsWord[wordChar.length - 1 - i] = wordChar[i];
        }
        for (int j = 0; j < wordChar.length; j++) {
            if (wordChar[j] != backwardsWord[j]) {
                return false;
            }
        }
        return true;
    }
}
