package com.softserve.task6_happy_tickets;

public class Display {
    private static final String INFO = "This program can calculate the number of lucky tickets between two given.";
    private static final String MESSAGE = "Please enter the number of ticket";
    private static final String ERROR_MASSAGE = "Invalid entry for ticket number.\n" +
            "The ticket number should be only six integer values.";
    private static final String END = "Thank you. Bye.";

    static void showInfo(){
        System.out.println(INFO);
    }

    static void showMessage(){
        System.out.println(MESSAGE);
    }

    static void showErrorInfo(){
        System.out.println(ERROR_MASSAGE);
    }

    static void showEnd(){
        System.out.println(END);
    }

}
