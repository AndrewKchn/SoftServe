package com.softserve.task1;

import java.util.Scanner;

class InputData {

   private static boolean dataIsCorrect(String inputDate){
        int data;
        try {
            data = Integer.parseInt(inputDate);
        } catch (NumberFormatException e){
            return false;
        }
        return (data > 0);
    }

    static int consoleDataInput(){
        String consoleIn;
        Scanner scanner = new Scanner(System.in);
        do {
            consoleIn = scanner.nextLine();
            if (!dataIsCorrect(consoleIn)){
                Display.showErrorInfo();
            }
        } while (!dataIsCorrect(consoleIn));
        return Integer.parseInt(consoleIn);
    }

    static ChessField chessBoardInputParam(){
        System.out.println("Please enter a board width.");
        int weight = consoleDataInput();
        System.out.println("Please enter a board height.");
        int height = consoleDataInput();
        return new ChessField(weight,height);
    }
}
