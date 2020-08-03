package com.galvanize.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameTest {
//    ### Acceptance Criteria
//    1. create a new game
    @Test
    void canCreateNewGame() {
        Game game = new Game();
        assertNotNull(game);
    }

//    1. can record rolling of ball
//    1. all (20) gutters
//    1. all (20) ones
//    1. one spare, one roll with pins down, and the rest (17) gutters
//    1. one strike, two rolls with pins down, and the rest (16) gutters
//    1. perfect game - 10 strikes + two 10s (strikes)
}