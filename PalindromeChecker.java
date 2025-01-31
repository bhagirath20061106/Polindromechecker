import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            String reversedWord = "";
            
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            
            if (word.equals(reversedWord)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }
    }
}
