import java.util.Scanner;

public class ChangeCountingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of quarters
        System.out.print("Enter the number of quarters: ");
        int quarters = scanner.nextInt();

        // Ask for the number of dimes
        System.out.print("Enter the number of dimes: ");
        int dimes = scanner.nextInt();

        // Ask for the number of nickels
        System.out.print("Enter the number of nickels: ");
        int nickels = scanner.nextInt();

        // Ask for the number of pennies
        System.out.print("Enter the number of pennies: ");
        int pennies = scanner.nextInt();

        // Calculate the total amount in dollars
        double totalAmount = (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01);

        // Print the total amount in dollars
        System.out.println("Total amount: $" + totalAmount);
    }
}
