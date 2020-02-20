package com.softserve.task1;

class Display {

    static void showInfo(){
        System.out.println("This program creates and show a chessboard in the console.");
    }

    static void showErrorInfo(){
        System.out.println("Board sizes must be integer values greater than zero. Please try again.");
    }

    static void showChessBoard(ChessBoard cb){
        System.out.println(cb);
    }


    static void showEnd(){
        System.out.println("Thank you. Bye.");
    }









}
