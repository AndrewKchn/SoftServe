package com.softserve.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChessBoard {

    private int width;
    private int height;


    private ChessBoard(int width, int height) throws IllegalArgumentException{
        if (width <= 0 || height <=0){
            throw new IllegalArgumentException();
        }
        this.width = width;
        this.height = height;
        for (int w = 0; w < width; w++) {
            for (int h = 0; h < height; h++) {
                if ((w + h) % 2 == 0){
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static ChessBoard create() {
        int width;
        int height;
        boolean continueLoop = true;
        ChessBoard result = null;
        System.out.println("This program displays a chessboard with the given dimensions of width and height.");
        do {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Please enter the width of the board");
                width = scanner.nextInt();
                System.out.println("Please enter the height of the board");
                height = scanner.nextInt();
                result = new ChessBoard(width, height);
                continueLoop = false;
            } catch (InputMismatchException e) {
                System.out.println("Only integer values allowed");
            } catch (IllegalArgumentException e){
                System.out.println("Board size must be greater then zero");
            }
        } while (continueLoop);
        return result;
    }

    public static void main(String[] args) {
        ChessBoard.create();
    }


}
