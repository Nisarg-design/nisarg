/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and checks if a hardcoded lucky card is present in the hand.
 * 
 * @author dancye
 * @modifier Nisarg Ambade, Student# 991808689 - June 1, 2025
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];
        Random rand = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }

        Card luckyCard = new Card();
        luckyCard.setValue(10);
        luckyCard.setSuit("Hearts");

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() &&
                card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Lucky card found in the magic hand!");
        } else {
            System.out.println("Lucky card NOT found in the magic hand.");
        }

        System.out.println("Cards in the magic hand:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }

        System.out.println("Lucky Card: " + luckyCard.getValue() + " of " + luckyCard.getSuit());
    }
}
