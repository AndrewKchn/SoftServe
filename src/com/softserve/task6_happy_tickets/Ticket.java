package com.softserve.task6_happy_tickets;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private int number;

    public Ticket(int number) {
        this.number = number;
    }

    private int[] numberToArray() {
        int[] result = new int[6];
        int tempNum = number;
        for (int i = 5; i >= 0; i--) {
            result[i] = tempNum % 10;
            tempNum = tempNum / 10;
        }
        return result;
    }

    private boolean isSimpleHappy() {
        int firstHalfAmount = 0;
        int lastHalfAmount = 0;
        int[] tempNumberArray = this.numberToArray();
        for (int i = 0; i < 6;i++){
            if (i < 3) firstHalfAmount += tempNumberArray[i];
            else lastHalfAmount += tempNumberArray[i];
        }
        return firstHalfAmount == lastHalfAmount;
    }

    private boolean isDifficultHappy(){
        int firstHalfAmount = 0;
        int lastHalfAmount = 0;
        int[] tempNumberArray = this.numberToArray();
        for (int i = 0; i < 6; i++){
            if (i % 2 == 0) firstHalfAmount += tempNumberArray[i];
            else lastHalfAmount += tempNumberArray[i];
        }
        return firstHalfAmount == lastHalfAmount;
    }

    private static List<Ticket> allTickets(Ticket firstTicket, Ticket lastTicket) {
        List<Ticket> ticketList = new ArrayList<>();
        int first = firstTicket.number;
        int last = lastTicket.number;
        for (int ticNum = first; ticNum <= last; ticNum++) {
            ticketList.add(new Ticket(ticNum));
        }
        return ticketList;
    }

    private static int countSimpleHappyTickets(List<Ticket> tickets){
        int result = 0;
        for (Ticket t: tickets){
            if (t.isSimpleHappy()) result++;
        }
        return result;
    }

    private static int countDifficultHappyTickets(List<Ticket> tickets){
        int result = 0;
        for (Ticket t: tickets){
            if (t.isDifficultHappy()) result++;
        }
        return result;
    }

    static void result(Ticket first, Ticket last){
        int simple = countSimpleHappyTickets(allTickets(first, last));
        int difficult = countDifficultHappyTickets(allTickets(first, last));
        if (simple > difficult){
            System.out.println("Simple method won");
            System.out.println("Amount of happy tickets is " + simple);
        } else {
            System.out.println("Difficult method won");
            System.out.println("Amount of happy tickets is " + difficult);
        }
    }

    @Override
    public String toString() {
        return "Ticket№ " + number;
    }

    public static void main(String[] args) {
        Ticket first = new Ticket(123456);
        Ticket last = new Ticket(987654);
        result(first,last);
    }
}
