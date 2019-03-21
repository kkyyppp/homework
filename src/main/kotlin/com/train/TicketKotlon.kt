package com.train

class TicketKotlon(oneWayTicketPrice:Int, discount:Float) {

    private var oneWayTicketPrice:Int = 0
    private var roundTripTicketPrice:Int = 0
    private var ticketQuantity:Int = 0
    private var roundTicketQuantity:Int = 0


    init {
        this.oneWayTicketPrice = oneWayTicketPrice;
        roundTripTicketPrice  = (oneWayTicketPrice*discount*2).toInt()
    }



    fun getTotalPrice():Int {

        val totalPrice:Int = roundTicketQuantity * roundTripTicketPrice +
                (ticketQuantity - roundTicketQuantity) * oneWayTicketPrice

        return totalPrice
    }



     public fun setTicketQuantity(ticketQuantity:Int) {
        this.ticketQuantity = ticketQuantity
    }

    fun setRroundTicketQuantity(roundTicketQuantity:Int) {
        this.roundTicketQuantity = roundTicketQuantity
    }

}