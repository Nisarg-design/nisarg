public abstract class Card {
    protected String name;
    protected int attack;
    protected int defense;
    protected int speed;
    protected int health = 100;

    public Card(String name, int attack, int defense, int speed) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public String getName() { return name; }

    public void reduceHealth(int amount) {
        health -= amount;
        if (health < 0) health = 0;
    }

    public String toString() {
        return name + " [ATK: " + attack + ", DEF: " + defense + ", SPD: " + speed + ", HP: " + health + "]";
    }
}