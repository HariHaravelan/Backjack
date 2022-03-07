package com.game;

import static com.game.GamePlay.ACE_MAX_VALUE;

public enum Type {

    TWO(2, "2"), THREE(3, "3"), FOUR(4, "4"), FIVE(5, "5"),
    SIX(6, "6"), SEVEN(7, "7"), EIGHT(8, "8"), NINE(9, "9"),
    TEN(10, "10"),
    ACE(ACE_MAX_VALUE, "A") {
        @Override
        public int getDefaultValue(int totalValue) {
            if (totalValue + ACE_MAX_VALUE > 21) {
                return 1;
            }
            return ACE_MAX_VALUE;
        }
    },
    JACK(10, "J"), QUEEN(10, "Q"), KING(10, "K");

    private int defaultValue;
    private String symbol;

    Type(int defaultValue, String symbol) {
        this.defaultValue = defaultValue;
        this.symbol = symbol;
    }

    public int getDefaultValue(int totalValue) {
        return this.defaultValue;
    }

    @Override
    public String toString() {
        return this.symbol;
    }
}
