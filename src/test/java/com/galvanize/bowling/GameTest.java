package com.galvanize.bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    Game game;

    @BeforeEach
    void setUp() {
        this.game = new Game();
    }

    @Test
    void canScoreGutterGame() {
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }

    @Test
    void canScoreAllOnes() {
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        assertEquals(20, game.score());
    }

    @Test
    void canScore_oneSpare_roll5_restGutters() {
        game.roll(5);
        game.roll(5);
        game.roll(5);
        for (int i = 0; i < 17; i++) {
            game.roll(0);
        }
        assertEquals(20, game.score());
    }

    @Test
    void canScore_oneStrike_roll5_roll5_restGutters() {
        game.roll(10);
        game.roll(5);
        game.roll(5);
        for (int i = 0; i < 16; i++) {
            game.roll(0);
        }
        assertEquals(30, game.score());
    }

    @Test
    void canScore_perfectGame() {
        for (int i = 0; i < 12; i++) {
            game.roll(10);
        }
        assertEquals(300, game.score());
    }
}