package com.softserve.task1;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {

    private List<ChessField> playField = new ArrayList<>();
    private ChessField size;


    private ChessBoard() {
    }

    public ChessField getSize() {
        return size;
    }

    public static ChessBoard create(ChessField size) {
        ChessBoard result = new ChessBoard();
        result.size = size;
        for (int h = 0; h < size.getWidth(); h++) {
            for (int w = 0; w < size.getHeight(); w++) {
                result.playField.add(new ChessField(w,h));
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
//        for (ChessField c:playField){
//            result.append(c);
//        }

        for (ChessField c : playField) {
            if (c.getWidth() == size.getWidth() - 1) result.append(c + "\n");
            else result.append(c);
        }
        return new String(result);
    }
}
