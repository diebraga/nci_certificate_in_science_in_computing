package softwareDevelopment.week5Lab.RockPaperScissors;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            System.out.println("Choose an option as an integer:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            int userChoice = scanner.nextInt();

            // Computer's choice random
            int computerChoice = random.nextInt(3) + 1;

            // Convert integer choices should strings output
            String userOption = convertChoiceToString(userChoice);
            String computerOption = convertChoiceToString(computerChoice);

            System.out.println("You chose " + userOption + ", the Computer chose " + computerOption);

            // Determine and display the result
            if (userChoice == computerChoice) {
                System.out.println("It's a draw!");
            } else {
                // switch statement
                switch (userChoice) {
                    case 1: // is Rock
                        System.out.println(computerChoice == 2 ? "You lose!" : "You win!");
                        break;
                    case 2: // is Paper
                        System.out.println(computerChoice == 3 ? "You lose!" : "You win!");
                        break;
                    case 3: // is Scissors
                        System.out.println(computerChoice == 1 ? "You lose!" : "You win!");
                        break;
                }
            }
        }
    }

    // onvert integer choice to what represents
    private static String convertChoiceToString(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }
}
