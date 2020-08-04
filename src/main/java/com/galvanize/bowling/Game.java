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
            if(isStrike(cursor)){ // Strike
                score += 10 + rolls[cursor+1] + rolls[cursor+2];
                cursor += 1;
            }else if(isSpare(cursor)) {
                score += 10 + rolls[cursor+2];
                cursor += 2;
            }else {
                score += rolls[cursor] + rolls[cursor + 1];
                cursor += 2;
            }
        }

        return score;
    }

    private boolean isStrike(int cursor) {
        return rolls[cursor] ==10;
    }

    private boolean isSpare(int cursor) {
        return rolls[cursor] + rolls[cursor + 1] == 10;
    }
}
