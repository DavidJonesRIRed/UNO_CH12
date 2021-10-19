package com.DavidJones.deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StandardUnoDeck implements Deck{
    private List<Card> cards = new ArrayList<>();
    final private int[] VALUES1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    final private int[] VALUES2 = {0,13,14};
    //final private String[] COLORS = {"\uD83D\uDFE5","\ud83d\udfe6","\ud83d\udfe8","\ud83d\udfe9"};
    final private String[] COLORS = {"Red","Blue","Yellow","Green"};

    public StandardUnoDeck() {
        for(int i = 1; i < 3;i++){
            for (String color : COLORS) {
                for (int val : VALUES1) {
                    cards.add(new Card(val, color));
                }
            }
        }

        for (String color : COLORS) {
            for (int val : VALUES2) {
                cards.add(new Card(val, color));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.remove(cards.size() - 1);
    }
}
