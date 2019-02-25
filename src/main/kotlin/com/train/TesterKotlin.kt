package com.train

import java.util.*

fun main(args: Array<String>) {

    var ticket:TicketKotlon  = TicketKotlon(1000, 0.9f)
    val scanner =  Scanner(System.`in`)

    print("Please enter number of tickets: ")
    var ticketAmount = scanner.nextInt()
    ticket.setTicketQuantity(ticketAmount)

    print("How many round-trip tickets: ")
    var roundTripTicketAmount = scanner.nextInt()
    ticket.setRroundTicketQuantity(roundTripTicketAmount)

    scanner.close()

    ticket.printInformation()

}