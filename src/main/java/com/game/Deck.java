package com.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        loadCards();
    }

    private void loadCards() {
        for (Suit suit : Suit.values()) {
            for (Type type : Type.values()) {
                this.cards.add(new Card(suit, type));
            }
        }
    }

    public Card getACard() {
        int randomIndex = new Random().nextInt(this.cards.size());
        return this.cards.remove(randomIndex);
    }
}
