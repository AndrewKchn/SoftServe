package com.softserve.task1;

public class ChessField {
    private int width;
    private int height;
    private String collor;

    private final static String BLACK = "*";
    private final static String WHITE = " ";

    public ChessField(int width, int height) {
        this.width = width;
        this.height = height;
        paintChessField();
    }

    private void paintChessField() {
        if ((this.width + this.height) % 2 == 0) collor = BLACK;
        else collor = WHITE;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return this.collor;
    }
}
