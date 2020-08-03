package com.galvanize.bowling;

public class Game {
    int score = 0;

    public void roll(int pinsDown) {
        this.score = score + pinsDown;
    }

    public int score() {
        return this.score;
    }
}
