package com.galvanize.bowling;

public class Game {
//    private int score = 0;
    private int roll =0;
    private int[] rolls = new int[20];

    public void roll(int pinsDown) {
        rolls[roll++] = pinsDown;
//        this.score = score + pinsDown;
    }

    public int score() {
        int score = 0;
        int cursor = 0;
        for (int frame = 0; frame < 10; frame++) {
            if(rolls[cursor]+rolls[cursor+1] == 10) { // Spare
                score += 10 + rolls[cursor+2];
                cursor += 2;
            }else {
                score += rolls[cursor] + rolls[cursor + 1];
                cursor += 2;
            }
        }

        return score;
    }
}
