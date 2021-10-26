package com.DavidJones.uno;

public interface Actor {
    byte play = 1;
    byte drawCard = 2;
    byte draw2 = 3;
    byte wildDraw4 = 4;
    byte skip = 5;
    byte wild =6;


    public String getName();
    public int getAmountOfCards();
    public String selectColor();
    public byte getAction(Hand hand);
}
