/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nisarg
 */
public class Player {
    private String name;
    private int score;
    private Deck deck;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() { return name; }
    public int getScore() { return score; }
    public void addPoint() { score++; }
    public void setDeck(Deck deck) { this.deck = deck; }
    public Deck getDeck() { return deck; }
}