import java.util.*;

public class Game {
    private Player player1;
    private Player player2;

    public Game(Player p1, Player p2) {
        this.player1 = p1;
        this.player2 = p2;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        for (int round = 1; round <= 5; round++) {
            System.out.println("\n=== Round " + round + " ===");

            PokemonCard c1 = (PokemonCard) player1.getDeck().drawCard();
            PokemonCard c2 = (PokemonCard) player2.getDeck().drawCard();

            if (c1 == null || c2 == null) {
                System.out.println("Not enough cards. Game over early.");
                break;
            }

            System.out.println(player1.getName() + " drew: " + c1);
            System.out.println(player2.getName() + " drew: " + c2);

            System.out.print("Choose stat to battle (attack/defense/speed): ");
            String stat = scanner.nextLine();

            c1.tryUseAbility(stat);
            c2.tryUseAbility(stat);

            int s1 = c1.getStat(stat);
            int s2 = c2.getStat(stat);

            System.out.println(player1.getName() + "'s " + stat + ": " + s1);
            System.out.println(player2.getName() + "'s " + stat + ": " + s2);

            if (s1 > s2) {
                System.out.println(player1.getName() + " wins the round!");
                player1.addPoint();
                c2.reduceHealth(s1 - s2);
            } else if (s2 > s1) {
                System.out.println(player2.getName() + " wins the round!");
                player2.addPoint();
                c1.reduceHealth(s2 - s1);
            } else {
                System.out.println("Round is a tie!");
            }

            System.out.println(c1);
            System.out.println(c2);
        }

        System.out.println("\n=== Final Scores ===");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("The game is a draw!");
        }

        scanner.close();
    }
}
