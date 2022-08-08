package com.virjanand;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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
    private ByteArrayOutputStream output;
    private PrintStream originalOut;

    @BeforeEach
    void redirectStandardOut() {
        originalOut = System.out;
        output = new ByteArrayOutputStream();

        System.setOut(new PrintStream(output));

    }

    @Test
    void printStartingPosition() {
        GameOfLife gameOfLife = new GameOfLife(STARTING_POSITION);
        gameOfLife.printPosition();

        assertThat(output.toString()).isEqualTo(STARTING_POSITION);
    }

    @AfterEach
    void restoreStandardOut() {
        System.setOut(originalOut);
    }
}
