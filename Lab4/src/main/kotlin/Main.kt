package org.example




class YliAliPeli(val low: Int, val high: Int) {
    val secret = (low..high).random()

    var guesses = 0

    fun arvaa(arvaus: Int): Arvaustulos {
        guesses++
        return when {
            arvaus > secret -> Arvaustulos.High
            arvaus < secret -> Arvaustulos.Low
            else -> Arvaustulos.Hit
        }
    }
}


enum class Arvaustulos {
    Low, Hit, High
}


fun main() {
    val peli = YliAliPeli(1, 100)
    var peliPaattynyt = false


    println("Arvaa numero väliltä 1-100.")


    while (!peliPaattynyt) {
        println("Anna arvauksesi:")
        val arvaus = readLine()?.toIntOrNull()

        if (arvaus != null) {
            val tulos = peli.arvaa(arvaus)
            when (tulos) {
                Arvaustulos.High -> println("pienempi.")
                Arvaustulos.Low -> println("suurempi.")
                Arvaustulos.Hit -> {
                    println("Oikein! Arvasit numeron ${peli.secret}.")
                    println("Teit yhteensä ${peli.guesses} arvausta.")
                    peliPaattynyt = true
                }
            }
        } else {
            println("Syötä kelvollinen numero.")
        }
    }
}
