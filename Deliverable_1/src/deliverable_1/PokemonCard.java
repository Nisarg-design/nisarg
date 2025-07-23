/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable_1;

/**
 *
 * @author Nisarg
 */
public class PokemonCard extends Card {
    private Ability ability;
    private boolean abilityUsed;

public PokemonCard(String name, int attack, int defense, int speed, Ability ability) {
    super(name, attack, defense, speed);
    this.ability = ability;
    this.abilityUsed = false;
}


    public Ability getAbility() {
        return ability;
    }

    public void boostStat(String stat, int amount) {
        switch (stat.toLowerCase()) {
            case "attack": attack += amount; break;
            case "defense": defense += amount; break;
            case "speed": speed += amount; break;
        }
    }

    public void tryUseAbility(String stat) {
        if (!abilityUsed) {
            ability.applyBoost(this, stat);
            abilityUsed = true;
        }
    }

    public String getDisplay() {
        return name + " (ATK: " + attack + ", DEF: " + defense + ", SPD: " + speed + ")";
    }

    public int getStat(String stat) {
        return switch (stat.toLowerCase()) {
            case "attack" -> attack;
            case "defense" -> defense;
            case "speed" -> speed;
            default -> 0;
        };
    }
}
