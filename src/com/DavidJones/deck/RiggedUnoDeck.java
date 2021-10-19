package com.DavidJones.deck;

import com.DavidJones.Utils.Console;

public class RiggedUnoDeck implements Deck {
    final private String[] COLORS = {"\u1F7E5", "\u1f7e6","\u1f7e8", "\u1f7e9"};

    @Override
    public void shuffle() {
        return;
    }

    @Override
    public Card draw() {
        int value = Console.getInt(0, 13, "enter number 0-14", "invalid entry");
        int color = Console.getInt(1, 4, "1. \u1F7E5 | 2. \u1f7e6 | 3. \u1f7e8 | 4. \u1f7e9", "Invalid entry");
        return new Card(value, COLORS[color - 1]);
    }
}
