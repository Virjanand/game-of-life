package com.virjanand;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class GameOfLifeTest {

    public static final String STARTING_POSITION = "" +
            "........\n" +
            "....*...\n" +
            "...**...\n" +
            "........";

    @Test
    void printStartingPosition() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        System.setOut(new PrintStream(output));

        GameOfLife gameOfLife = new GameOfLife(STARTING_POSITION);
        gameOfLife.printPosition();

        assertThat(output.toString()).isEqualTo(STARTING_POSITION);

        System.setOut(originalOut);
    }
}
