import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

       while(true) {
            System.out.println("Welcome To Temperature Converter");
            System.out.println("1: Celsius to Fahrenheit");
            System.out.println("2: Fahrenheit to Celsius");
            System.out.println("0: Exits");
            System.out.print("Choose an option (0, 1, or 2): ");
            int choice = scanner.nextInt();
           if (choice == 0) {
               System.out.println("Exiting... Goodbye!");
               break;
           }
           System.out.println("Enter Temperature.");
            double temp = scanner.nextDouble();
            double converted;

           if (choice == 1) {
                converted = (temp * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + converted);
                System.out.println("******************************************");
            } else if (choice == 2) {
                converted = (temp - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + converted);
               System.out.println("******************************************");
            } else {
                System.out.println("Invalid Choice!.");
            }

        }
    }
}
