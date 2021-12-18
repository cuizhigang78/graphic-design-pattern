package com.cui.part3.singleton.test;


public class TicketMakerTest {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            TicketMaker ticketMaker = TicketMaker.getTicketMaker();
            System.out.println(ticketMaker.getNextTicketNumber());
        }
    }
}