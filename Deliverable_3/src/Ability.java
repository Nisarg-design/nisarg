/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
        System.out.println("Using ability " + name + " to boost " + stat + " by " + boostAmount);
        card.boostStat(stat, boostAmount);
    }
}