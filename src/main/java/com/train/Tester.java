package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Ticket ticket = new Ticket(1000, 0.9f);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number of tickets: ");
        int ticketQuantity = scanner.nextInt();
        ticket.setTicketQuantity(ticketQuantity);

        System.out.print("How many round-trip tickets: ");
        int roundTripTicketQuantity = scanner.nextInt();
        ticket.setRoundTripTicketQuantity(roundTripTicketQuantity);

        scanner.close();

        ticket.printInfomation();
    }
}
