import java.util.Scanner;
import java.util.regex.*;

public class PasswordStrengthChecker {

    public static String checkStrength(String password) {
        int strength = 0;
        StringBuilder feedback = new StringBuilder();

        // Check length
        if (password.length() >= 8) {
            strength++;
        } else {
            feedback.append("• Password should be at least 8 characters long.\n");
        }

        // Check uppercase
        if (Pattern.compile("[A-Z]").matcher(password).find()) {
            strength++;
        } else {
            feedback.append("• Include at least one uppercase letter.\n");
        }

        // Check lowercase
        if (Pattern.compile("[a-z]").matcher(password).find()) {
            strength++;
        } else {
            feedback.append("• Include at least one lowercase letter.\n");
        }

        // Check digits
        if (Pattern.compile("[0-9]").matcher(password).find()) {
            strength++;
        } else {
            feedback.append("• Include at least one number.\n");
        }

        // Check special characters
        if (Pattern.compile("[!@#$%^&*(),.?\":{}|<>]").matcher(password).find()) {
            strength++;
        } else {
            feedback.append("• Include at least one special character.\n");
        }

        // Return verdict
        if (strength == 5) {
            return "Strong password";
        } else if (strength >= 3) {
            return "Moderate password\n" + feedback.toString();
        } else {
            return "Weak password\n" + feedback.toString();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        String result = checkStrength(password);
        System.out.println(result);
        scanner.close();
    }
}

