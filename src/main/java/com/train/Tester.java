package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Ticket ticket = new Ticket(1000, 0.9f);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number of tickets: ");
        int ticketQuantity = scanner.nextInt();
        ticket.setTicketQuantity(ticketQuantity);

        while (ticketQuantity != -1) {

            System.out.print("How many round-trip tickets: ");
            int roundTripTicketQuantity = scanner.nextInt();
            ticket.setRoundTripTicketQuantity(roundTripTicketQuantity);

            System.out.println("Total tickets: " + ticketQuantity);
            System.out.println("Round-trip: " + roundTripTicketQuantity);
            System.out.println("Total: " + ticket.getTotalPrice());

            System.out.print("Please enter number of tickets: ");
            ticketQuantity = scanner.nextInt();
            ticket.setTicketQuantity(ticketQuantity);
        }

        scanner.close();

        System.out.println("Finish");
    }
}
