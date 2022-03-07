package com.game;

public class GamePlay {

    public static final int INITIAL_CARDS_COUNT = 2;
    public static final int ACE_MAX_VALUE = 11;

    public static String getOutcome(Player player, Dealer dealer) {
        if (player.getStatus().equals(Status.BUST)) {
            return "Player Bust, Dealer Wins";
        } else if (player.getScore() == dealer.getScore()) {
            return "Tie";
        } else if (dealer.getStatus().equals(Status.BUST)) {
            return "Dealer Bust, Player Wins";
        } else if (player.getScore() > dealer.getScore()) {
            return "Player Wins";
        }
        return "Dealer Wins";
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        Dealer dealer = new Dealer(deck);
        Player player = new Player(dealer);
        while (player.canHit()) {
            player.play();
        }
        while (dealer.canHit()) {
            dealer.play();
        }
        System.out.println(getOutcome(player, dealer));

    }

}