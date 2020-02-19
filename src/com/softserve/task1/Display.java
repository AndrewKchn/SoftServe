package com.softserve.task1;

public class Display {

    public static void showInfo(){
        System.out.println("This program creates and show a chessboard in the console.");
    }

    public static void showParamInfo(){
        System.out.println("Board sizes must be integer values greater than zero. Please try again.");
    }

    public static void showChessBoard(ChessBoard cb){
        System.out.println(cb);
    }

    public static void showEnd(){
        System.out.println("Thank you. Bye.");
    }









}
