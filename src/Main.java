import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        welcomeMessage.printWelcomeMessage();
        menu();

        // Create a scanner object to read user input
        Scanner in = new Scanner(System.in);
        int choice;

        while (true) {
            // Read user's choice
            choice = in.nextInt();

            if (choice >= 1 && choice <= 4) {
                // Process user's choice
                switch (choice) {
                    case 1:
                        celsiusToAll();
                        break;
                    case 2:
                        fahrenheitToAll();
                        break;
                    case 3:
                        kelvinToAll();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                }

                if (choice == 4) {
                    break;
                } else {
                    menu();
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        in.close();
    }
    public static void menu() {
        System.out.print("\033[1m"); // Enable bold style
        System.out.println("\nMenu:");
        System.out.println("What type of unit you have?");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("4. Exit");
        System.out.print("\033[0m"); // Reset text style
        System.out.println("\nEnter your choice: ");
    }

    public static void celsiusToAll(){

        System.out.println("Enter the temperature in Celsius: ");
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        input.close();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        double kelvin = celsius + 273.15;
        System.out.println("Temperature in Kelvin: " + kelvin);

    }

    public static void fahrenheitToAll(){

        System.out.println("Enter the temperature in Fahrenheit: ");
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();
        input.close();

        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature in Celsius: " + celsius);

        double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
        System.out.println("Temperature in Kelvin: " + kelvin);
    }

    public static void kelvinToAll(){

        System.out.println("Enter the temperature in Kelvin: ");
        Scanner input = new Scanner(System.in);
        double kelvin = input.nextDouble();
        input.close();

        double celsius = kelvin - 273.15;
        System.out.println("Temperature in Celsius: " + celsius);

        double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}