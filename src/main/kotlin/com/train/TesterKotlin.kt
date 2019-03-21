package com.train

import java.util.*

fun main(args: Array<String>) {

    var ticket:TicketKotlon  = TicketKotlon(1000, 0.9f)
    val scanner =  Scanner(System.`in`)

    print("Please enter number of tickets: ")
    var ticketAmount = scanner.nextInt()
    ticket.setTicketQuantity(ticketAmount)

    while(ticketAmount != -1) {
        print("How many round-trip tickets: ")
        var roundTripTicketAmount = scanner.nextInt()
        ticket.setRroundTicketQuantity(roundTripTicketAmount)

        println("Total tickets: " + ticketAmount)
        println("Round-trip: $roundTripTicketAmount")
        println("Total: ${ticket.getTotalPrice()}")

        print("Please enter number of tickets: ")
        ticketAmount = scanner.nextInt()
        ticket.setTicketQuantity(ticketAmount)
    }
    scanner.close()

    println("Finish")
}