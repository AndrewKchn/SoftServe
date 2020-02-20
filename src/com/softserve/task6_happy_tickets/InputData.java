package com.softserve.task6_happy_tickets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputData {

    private static String inputData() {
        Scanner scanner = new Scanner(System.in);
        String validData;
        do {
            Display.showMessage();
            validData = scanner.nextLine();
            if (!DataValidator.isCorrectForTicket(validData)) {
                Display.showErrorInfo();
            }
        } while (!DataValidator.isCorrectForTicket(validData));
        return validData;
    }

    private static int stringToInt(String stringInputData) {
        return Integer.parseInt(stringInputData);
    }

    static List<Ticket> inputTicketsNumbers(int amountTickets) {
        List<Ticket> result = new ArrayList<>();
        for (int i = 0; i < amountTickets; i++){
            result.add(new Ticket(stringToInt(inputData())));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(inputTicketsNumbers(2));
    }
}
