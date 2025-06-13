import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ask the user for their favorite number and double it.
        System.out.println("Enter your favorite number:");
        int favoriteNumber = scanner.nextInt();
        int doubledNumber = favoriteNumber * 2;
        System.out.println("Your favorite number doubled is: " + doubledNumber);

        // 2. Ask for a decimal number and halve it.
        System.out.println("Enter a decimal (double) number:");
        double decimalNumber = scanner.nextDouble();
        double halvedDecimal = decimalNumber / 2;
        System.out.println("Half of your decimal number is: " + halvedDecimal);

        // 3. Get a character, convert it to its ASCII value, and display it.
        System.out.println("Enter a single character:");
        char character = scanner.next().charAt(0);
        int asciiValue = (int) character;
        System.out.println("The ASCII value of " + character + " is: " + asciiValue);

        // 4. Check if the user wants pizza by asking for a yes/no (true/false).
        System.out.println("Do you like pizza? (true/false):");
        boolean likesPizza = scanner.nextBoolean();
        System.out.println("It is " + likesPizza + " that you like pizza!");

        // Thank the user for playing the game.
        System.out.println("Thanks for playing! You’ve learned about Java primitive types.");

        // Close the scanner
        scanner.close();
    }
}