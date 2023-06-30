public class SnakeEyesSimulation {
    public static void main(String[] args) {
        int rolls = 0;
        int dice1, dice2;

        do {
            dice1 = (int) (Math.random() * 6) + 1; // Roll the first dice (random number between 1 and 6)
            dice2 = (int) (Math.random() * 6) + 1; // Roll the second dice (random number between 1 and 6)
            rolls++; // Increment the number of rolls
        } while (!(dice1 == 1 && dice2 == 1)); // Continue rolling until snake eyes are rolled
        System.out.println("It took " + rolls + " rolls to get snake eyes.");  // Print the roll result for debugging (optional)
    }
}
