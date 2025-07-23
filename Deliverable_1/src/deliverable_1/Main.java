/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable_1;

/**
 *
 * @author Nisarg
 */
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Player 1 name: ");
        String player1Name = scanner.nextLine();

        Player player1 = new Player(player1Name);
        Player player2 = new Player("Ash");

        List<PokemonCard> pokemons = List.of(
            new PokemonCard("Pikachu", 60, 40, 80, new Ability("Thunder Shock", 10)),
            new PokemonCard("Bulbasaur", 50, 60, 50, new Ability("Leaf Guard", 15)),
            new PokemonCard("Charmander", 65, 45, 70, new Ability("Ember", 20)),
            new PokemonCard("Squirtle", 40, 70, 45, new Ability("Water Gun", 15)),
            new PokemonCard("Gengar", 70, 40, 75, new Ability("Shadow Ball", 10))
        );

        Game game = new Game(player1, player2, pokemons);
        game.start();

        scanner.close();
    }
}
