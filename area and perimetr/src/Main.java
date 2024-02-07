import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Area and Perimeter Calculator\n");
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            double length = getDouble(sc, "Enter Length: ", 0.0, 1000000.0);
            double width = getDouble(sc, "Enter Width: ", 0.0, 1000000.0);
            double area = length * width;
            double perimeter = 2 * length + 2 * width;
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            choice = getChoice(sc, "Would you like to continue? (y/n): ");
            System.out.println();
        }
        System.out.println("Thanks, bye!");
        System.exit(0);
    }

    public static String getChoice(Scanner sc, String prompt) {
        String number;
        while (true) {
            System.out.print(prompt);
            number = sc.nextLine();
            if (number.equalsIgnoreCase("y") || number.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
            }
        }
        return number;
    }


    public static double getDouble(Scanner sc, String prompt, double min, double max) {
        double number;
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine();
            try {
                number = Double.parseDouble(input);
                if (number < min) {
                    throw new IllegalArgumentException("Number must be greater than " + min);
                } else if (number > max) {
                    throw new IllegalArgumentException("Number must be less than " + max);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid decimal value. Try again.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error! " + e.getMessage());
            }
        }
        return number;
    }
}