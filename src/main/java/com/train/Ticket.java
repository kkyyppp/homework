package com.train;

import java.util.Scanner;

public class Ticket {

    private int oneWayTicketPrice = 0;
    private int roundTripTicketPrice = 0;
    private int ticketQuantity= 0;
    private int roundTripTicketQuantity = 0;

    public Ticket(int oneWayTicketPrice, float discount) {
        this.oneWayTicketPrice = oneWayTicketPrice;
        roundTripTicketPrice = (int) (oneWayTicketPrice*discount*2);
    }


    public int getTotalPrice() {

        int totalPrice = roundTripTicketQuantity*roundTripTicketPrice +
                (ticketQuantity-roundTripTicketQuantity)*oneWayTicketPrice;

        return totalPrice;
    }


    public void setTicketQuantity(int ticketQuantity) {
        this.ticketQuantity = ticketQuantity;
    }

    public void setRoundTripTicketQuantity(int roundTripTicketQuantity) {
        this.roundTripTicketQuantity = roundTripTicketQuantity;
    }
}
