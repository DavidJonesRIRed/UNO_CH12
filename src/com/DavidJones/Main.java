package com.DavidJones;

import com.DavidJones.deck.Card;
import com.DavidJones.deck.Deck;
import com.DavidJones.deck.StandardUnoDeck;
import com.DavidJones.uno.Hand;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Deck deck = new StandardUnoDeck();
        deck.shuffle();
        Hand myHand = new Hand();
        myHand.addCard(deck.draw());
        System.out.println(myHand.displayHand());
    }
}
