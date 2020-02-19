package com.softserve.task1;

import java.util.Scanner;

public class InputData {

   private static boolean dataIsCorrect(String inputDate){
        int data;
        try {
            data = Integer.parseInt(inputDate);
        } catch (NumberFormatException e){
            return false;
        }
        return (data > 0);
    }

    static public int consoleDataInput(){
        String data;
        Scanner scanner = new Scanner(System.in);
        do {
            data = scanner.nextLine();
            if (!dataIsCorrect(data)){
                Display.showParamInfo();
            }
        } while (!dataIsCorrect(data));
        return Integer.parseInt(data);
    }

    public static ChessField chessBoardInputParam(){
        System.out.println("Please enter a board width.");
        int weight = consoleDataInput();
        System.out.println("Please enter a board height.");
        int height = consoleDataInput();
        return new ChessField(weight,height);
    }
}
