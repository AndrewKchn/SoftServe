package com.softserve.task1;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {

    private List<ChessField> playField = new ArrayList<>();
    private ChessField size;


    private ChessBoard() {}

    public static ChessBoard create(ChessField size) {
        ChessBoard result = new ChessBoard();
        result.size = size;
        for (int w = 0; w < size.getWidth(); w++) {
            for (int h = 0; h < size.getHeight(); h++) {
                result.playField.add(new ChessField(w, h));
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int w = 0; w < this.size.getWidth(); w++) {
            for (int h = 0; h < this.size.getHeight(); h++) {
                result.append(playField.get(w + h));
            }
            result.append("\n");
        }
        return new String(result);
    }
}
