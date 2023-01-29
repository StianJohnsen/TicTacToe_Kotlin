package TicTacToe

import java.util.*

interface Player {
    val player1Sign: String
    val player2Sign: String

    fun printWinner()


}

fun main(){
    for (i in 0..6){
        println(i%2)
    }
}

