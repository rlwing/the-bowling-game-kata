package com.galvanize.bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameTest {
//    ### Acceptance Criteria
//    1. create a new game
//    @Test
//    void canCreateNewGame() {
//        Game game = new Game();
//        assertNotNull(game);
//    }
    // Refactor to remove redundancy
    Game game;
    @BeforeEach
    void setUp() {
        this.game = new Game();
    }


//    1. can record rolling of ball
    @Test
    void canRollBall() {
        game.roll(0);
    }

//    1. all (20) gutters
    @Test
    void canScoreGutterGame() {
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }

//    1. all (20) ones
//    1. one spare, one roll with pins down, and the rest (17) gutters
//    1. one strike, two rolls with pins down, and the rest (16) gutters
//    1. perfect game - 10 strikes + two 10s (strikes)
}