package com.game;

public enum Status {
    HIT(0, 16), STAND(17, 20), BLACKJACK(21, 21), BUST(22, 100);

    private int min;
    private int max;

    Status(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static Status getStatus(int score) {
        Status[] statuses = Status.values();
        for (Status status : statuses) {
            if (status.min <= score && status.max >= score) {
                return status;
            }
        }
        return null;
    }
}
