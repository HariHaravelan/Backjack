package com.game;

import java.util.ArrayList;
import java.util.List;

import static com.game.GamePlay.INITIAL_CARDS_COUNT;

public class Dealer {
    private Deck deck;
    private List<Card> cards;
    private int score;
    private Status status;

    public Dealer(Deck deck) {
        this.cards = new ArrayList<>();
        this.deck = deck;
        for (int i = 0; i < INITIAL_CARDS_COUNT; i++) {
            play();
        }
    }

    public Card hit() {
        return this.deck.getACard();
    }

    public void play() {
        Card card = hit();
        this.score += card.getType().getDefaultValue(this.score);
        this.cards.add(card);
        this.status = Status.getStatus(this.score);
        System.out.printf("Dealer got %s \t score: %d \t status: %s \n", card, this.score,this.status.toString());
    }

    public boolean canHit() {
        return this.status.equals(Status.HIT);
    }

    public Status getStatus() {
        return status;
    }

    public int getScore() {
        return score;
    }
}
