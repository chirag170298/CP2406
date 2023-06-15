import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Convert the name to uppercase
        String uppercaseName = name.toUpperCase();

        // Greet the user
        System.out.println("Hello, " + uppercaseName + ", nice to meet you!");
    }
}
