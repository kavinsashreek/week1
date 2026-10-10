import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] moves = {"Rock", "Paper", "Scissors"};
        int playerWins = 0, computerWins = 0, draws = 0;

        for (int round = 1; round <= 5; round++) {
            System.out.println("\nRound " + round + " - 0: Rock, 1: Paper, 2: Scissors");
            int player;
            do {
                System.out.print("Your choice: ");
                while (!sc.hasNextInt()) {
                    System.out.print("Enter 0, 1, or 2: ");
                    sc.next();
                }
                player = sc.nextInt();
            } while (player < 0 || player > 2);

            int computer = random.nextInt(3);
            System.out.println("You: " + moves[player] + " | Computer: " + moves[computer]);

            if (player == computer) {
                draws++;
                System.out.println("Draw!");
            } else if ((player == 0 && computer == 2) ||
                       (player == 1 && computer == 0) ||
                       (player == 2 && computer == 1)) {
                playerWins++;
                System.out.println("You win this round!");
            } else {
                computerWins++;
                System.out.println("Computer wins this round.");
            }
        }

        System.out.println("\n--- Final Report ---");
        System.out.println("Player wins: " + playerWins);
        System.out.println("Computer wins: " + computerWins);
        System.out.println("Draws: " + draws);
        System.out.printf("Player win percentage: %.2f%%%n", playerWins / 5.0 * 100);
        sc.close();
    }
}