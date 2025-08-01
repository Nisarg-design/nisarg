/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nisarg
 */
import java.util.*;

public class Game {
    private Player p1, p2;
    private Scanner scanner = new Scanner(System.in);
    private List<PokemonCard> allCards;
    private Random random = new Random();

    public Game(Player p1, Player p2, List<PokemonCard> allCards) {
        this.p1 = p1;
        this.p2 = p2;
        this.allCards = allCards;
    }

    public void start() {
        int round = 1;
        while (round <= 4) { // Fixed 4-round gameplay
            PokemonCard c1 = getRandomPokemon();
            PokemonCard c2 = getRandomPokemon();

            System.out.println("\nROUND " + round);
            System.out.println(p1.getName() + ": " + c1.getDisplay());
            System.out.println(p2.getName() + ": " + c2.getDisplay());

            System.out.print("Choose stat (attack/defense/speed): ");
            String stat = scanner.nextLine().toLowerCase();

            // Input Validation
            while (!List.of("attack", "defense", "speed").contains(stat)) {
                System.out.print("Invalid stat. Choose attack/defense/speed: ");
                stat = scanner.nextLine().toLowerCase();
            }

            // Apply abilities (Delegation)
            c1.tryUseAbility(stat);
            c2.tryUseAbility(stat);

            int s1 = c1.getStat(stat);
            int s2 = c2.getStat(stat);

            System.out.println(c1.getName() + " " + stat + ": " + s1 + " VS " + c2.getName() + " " + stat + ": " + s2);

            if (s1 > s2) {
                System.out.println(p1.getName() + " wins the round.");
                p1.addPoint();
            } else if (s2 > s1) {
                System.out.println(p2.getName() + " wins the round.");
                p2.addPoint();
            } else {
                System.out.println("Round is a tie.");
            }

            System.out.println("Score: " + p1.getName() + " " + p1.getScore() + " - " + p2.getName() + " " + p2.getScore());
            round++;
        }

        System.out.println("\nGAME OVER");
        if (p1.getScore() > p2.getScore()) System.out.println(p1.getName() + " wins!");
        else if (p2.getScore() > p1.getScore()) System.out.println(p2.getName() + " wins!");
        else System.out.println("It's a draw!");
    }

    private PokemonCard getRandomPokemon() {
        PokemonCard base = allCards.get(random.nextInt(allCards.size()));
        return new PokemonCard(base.getName(), base.getAttack(), base.getDefense(), base.getSpeed(), base.getAbility());
    }
}
