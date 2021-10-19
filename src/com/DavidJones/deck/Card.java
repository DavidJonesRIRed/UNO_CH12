package com.DavidJones.deck;

public class Card {
    private int value;
    private String color;

    public Card(int value, String color) {
        this.value = value;
        this.color = color;
    }

    public int getValue() {return value;}

    public String display() {
        String output = "";
        switch(value) {
            case 10 -> output = "Skip";
            case 11 -> output = "Reverse";
            case 12 -> output = "Draw 2";
            case 13 -> output = "Wild";
            case 14 -> output = "Wild draw 4";
            default -> output = value < 10 ? Integer.toString(value) : " " + value;
        }
        return output + color;
    }

}
