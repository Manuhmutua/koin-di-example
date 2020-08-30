package com.manuh.sundaymorning.viewmodel

class FrankResturant(private val seatsSuplier: SeatsSuplier, private val catererySuplier: CatererySuplier) {

    fun openRestaurant() {
        seatsSuplier.suply()
        catererySuplier.suply()
    }

}

class SeatsSuplier {
    fun suply() {
        println("Suply Seats")
    }
}

class CatererySuplier {
    fun suply() {
        println("Suply Caterery")
    }
}