import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name for Player 1: ");
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);

        System.out.print("Enter name for Player 2: ");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);

        List<PokemonCard> allPokemons = List.of(
        new PokemonCard("Pikachu", 40, 30, 50, new Ability("Electric Boost", 10)),
        new PokemonCard("Charizard", 60, 50, 40, new Ability("Fire Fury", 15)),
        new PokemonCard("Bulbasaur", 30, 40, 30, new Ability("Nature's Touch", 20)),
        new PokemonCard("Squirtle", 35, 45, 25, new Ability("Water Pulse", 12)),
        new PokemonCard("Jigglypuff", 25, 20, 35, new Ability("Sing", 8)),
        new PokemonCard("Gengar", 55, 40, 60, new Ability("Shadow Strike", 18)),
        new PokemonCard("Eevee", 45, 35, 45, new Ability("Quick Attack", 10)),
        new PokemonCard("Snorlax", 70, 80, 20, new Ability("Heavy Slam", 25)),
        new PokemonCard("Lucario", 65, 60, 55, new Ability("Aura Sphere", 20)),
        new PokemonCard("Machamp", 75, 55, 35, new Ability("Power Punch", 22)),
        new PokemonCard("Dragonite", 80, 70, 60, new Ability("Dragon Claw", 25)),
        new PokemonCard("Alakazam", 60, 45, 75, new Ability("Psychic Boost", 18))
);

        List<PokemonCard> deck1Cards = new ArrayList<>(allPokemons.subList(0, 3));
        List<PokemonCard> deck2Cards = new ArrayList<>(allPokemons.subList(3, 5));

        Deck deck1 = new Deck(deck1Cards);
        Deck deck2 = new Deck(deck2Cards);

        player1.setDeck(deck1);
        player2.setDeck(deck2);

        Game game = new Game(player1, player2);
        game.start();

        scanner.close();
    }
}
