import java.util.Scanner;
import  java.util.Random;


public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Character pools
        String numbers = "0123456789";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        StringBuilder characterPool = new StringBuilder();

        // User inputs
        System.out.print("Enter desired password length: ");
        int length = scanner.nextInt();

        System.out.print("Include numbers? (y/n): ");
        if (scanner.next().equalsIgnoreCase("y")) {
            characterPool.append(numbers);
        }

        System.out.print("Include lowercase letters? (y/n): ");
        if (scanner.next().equalsIgnoreCase("y")) {
            characterPool.append(lowerCase);
        }

        System.out.print("Include uppercase letters? (y/n): ");
        if (scanner.next().equalsIgnoreCase("y")) {
            characterPool.append(upperCase);
        }

        System.out.print("Include special characters? (y/n): ");
        if (scanner.next().equalsIgnoreCase("y")) {
            characterPool.append(specialChars);
        }

        // Check if pool is empty
        if (characterPool.length() == 0) {
            System.out.println("You must select at least one character type.");
            return;
        }

        // Generate password
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }

        // Display result
        System.out.println("Generated Password: " + password.toString());
    }
}
