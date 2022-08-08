package com.virjanand;

public class GameOfLife {
    private final String position;

    public GameOfLife(String startingPosition) {

        this.position = startingPosition;
    }

    public void printPosition() {
        System.out.print(position);
    }
}
