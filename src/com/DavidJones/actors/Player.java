package com.DavidJones.actors;

import com.DavidJones.uno.Actor;
import com.DavidJones.uno.Hand;

public class Player implements Actor {
    private String name = "";

    public Player(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAmountOfCards() {
        return 0;
    }

    @Override
    public String selectColor() {
        return "";
    }

    @Override
    public byte getAction(Hand hand) {
        return 0;
    }
}
