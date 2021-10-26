package com.DavidJones.uno;

import com.DavidJones.actors.Player;
import com.DavidJones.deck.Deck;

public class Table {
    Hand player = new Hand(new Player("player"));
    //Hand DiscardPile = new Hand(new DiscardPile());
    Deck deck;
}
