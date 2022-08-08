package com.virjanand;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class GameOfLifeTest {

    @Test
    void printStartingPosition() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        System.setOut(new PrintStream(output));

        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.printPosition();

        assertThat(output.toString()).isEqualTo("" +
                "........\n" +
                "....*...\n" +
                "...**...\n" +
                "........");

        System.setOut(originalOut);
    }
}
