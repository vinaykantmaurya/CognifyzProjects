import java.util.Scanner;

public class PalindromeChecker {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a word or phrase: ");
            String input = scanner.nextLine();

            // 1. String Manipulation: Normalize the string
            StringBuilder cleaned = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (Character.isLetter(ch)) {
                    cleaned.append(Character.toLowerCase(ch));
                }
            }

            // 2. Reverse the cleaned string using loop
            StringBuilder reversed = new StringBuilder();
            for (int i = cleaned.length() - 1; i >= 0; i--) {
                reversed.append(cleaned.charAt(i));
            }

            // 3. Conditional Statement: Check for palindrome
            if (cleaned.toString().equals(reversed.toString())) {
                System.out.println("It's a palindrome!");
            } else {
                System.out.println("Not a palindrome.");
            }

            scanner.close();
        }
    }

