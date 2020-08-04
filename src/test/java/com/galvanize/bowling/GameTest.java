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


//    2. can record rolling of ball
//No longer necessary, roll is called in test 3
//    @Test
//    void canRollBall() {
//        game.roll(0);
//    }

//    3. all (20) gutters
    @Test
    void canScoreGutterGame() {
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }

//    4. all (20) ones
    @Test
    void canScoreAllOnes() {
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        assertEquals(20, game.score());
    }

//    5. one spare, one roll with pins down, and the rest (17) gutters
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

//    6. one strike, two rolls with pins down, and the rest (16) gutters
//    7. perfect game - 10 strikes + two 10s (strikes)
}