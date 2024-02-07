import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Dice Roller!\n");
        System.out.print("Roll the dice? (y/n): ");
        String choice = "y";
        Scanner sc = new Scanner(System.in);
        choice = sc.nextLine();
        while (choice.equalsIgnoreCase("y")){
            dice();
        }

    }

    static void dice(){
        Scanner sc = new Scanner(System.in);
        String choice1 = "y";
        while (choice1.equalsIgnoreCase("y")) {
            int randomNum = (int)(Math.random() * 6) + 1;
            int randomNum1 = (int)(Math.random() * 6) + 1;
            System.out.println("Die 1: " +randomNum);
            System.out.println("Die 2: " +randomNum1);
            int Total = randomNum + randomNum1;
            System.out.println("Total: " +Total);
            if (randomNum == 6 && randomNum1 == 6){
                System.out.println("Boxcar!");
            }
            if (randomNum1 == 1 && randomNum ==1){
                System.out.println("Snake eyes!");
            }
            System.out.print("Roll again? (y/n): ");
            choice1 = sc.nextLine();
        }
        System.out.println("Thanks, bye!");
        System.exit(0);

    }
}