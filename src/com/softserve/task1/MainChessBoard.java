package com.softserve.task1;

public class MainChessBoard {

    public static void main(String[] args) {
        Display.showInfo();
        ChessBoard chessBoard = ChessBoard.create(InputData.chessBoardInputParam());
        Display.showChessBoard(chessBoard);
    }
}
