public class DiceRollSimulation {
    public static void main(String[] args) {
        // Simulate rolling the first die
        int die1 = (int)(Math.random() * 6) + 1;
        System.out.println("The first die comes up " + die1);

        // Simulate rolling the second die
        int die2 = (int)(Math.random() * 6) + 1;
        System.out.println("The second die comes up " + die2);

        // Calculate the total roll
        int total = die1 + die2;
        System.out.println("Your total roll is " + total);
    }
}
