/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable_1;

/**
 *
 * @author Nisarg
 */
public class Ability {
    private String name;
    private int boostAmount;

    public Ability(String name, int boostAmount) {
        this.name = name;
        this.boostAmount = boostAmount;
    }

    public void applyBoost(PokemonCard card, String stat) {
        card.boostStat(stat, boostAmount);
        System.out.println(name + " ability applied: +" + boostAmount + " to " + stat);
    }
}
