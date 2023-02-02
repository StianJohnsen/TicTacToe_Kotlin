package ticTacToe

interface Player {

    val player1Sign: String
    val player2Sign: String

    fun printWinner(sign: String): String


}


