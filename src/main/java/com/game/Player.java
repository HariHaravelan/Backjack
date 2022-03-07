package com.game;

import java.util.ArrayList;
import java.util.List;


import static com.game.GamePlay.INITIAL_CARDS_COUNT;
import static com.game.Status.HIT;

public class Player {
    private List<Card> cards;
    private Dealer dealer;
    private int score;
    private Status status;

    public Player(Dealer dealer) {
        this.cards = new ArrayList<>();
        this.dealer = dealer;
        for (int i = 0; i < INITIAL_CARDS_COUNT; i++) {
            play();
        }
    }

    public void play() {
        Card card = this.dealer.hit();
        this.score += card.getType().getDefaultValue(this.score);
        this.cards.add(card);
        this.status = Status.getStatus(this.score);
        System.out.printf("Player got %s \t score: %d \t status: %s \n", card, this.score, this.status.toString());
    }

    public boolean canHit() {
        return this.status.equals(HIT);
    }

    public Status getStatus() {
        return status;
    }

    public int getScore() {
        return score;
    }
}
