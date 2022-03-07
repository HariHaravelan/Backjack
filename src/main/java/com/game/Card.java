package com.game;

public class Card {
    private Suit suit;
    private Type type;

    public Card(Suit suit, Type type) {
        this.suit = suit;
        this.type = type;
    }

    public Suit getSuit() {
        return suit;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return this.getType().toString() +  this.getSuit().toString();
    }
}
