package com.DavidJones.uno;

import com.DavidJones.deck.Card;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards = new ArrayList<>();
    private Actor holder;

    public Hand(Actor holder){
        this.holder = holder;
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public String displayHand(){
        StringBuilder output = new StringBuilder();

        for(Card card: cards) {
            output.append(card.display()).append(" ");
        }

        return output.toString();

    }

    public int size(){
        return cards.size();
    }
}
