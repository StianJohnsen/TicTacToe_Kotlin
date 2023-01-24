package TicTacToe

import java.util.*

class Player(val sign: String) {
    val _sign = sign
    val _signUpper = _sign.uppercase()

    fun printWinner(sign: String): String {
        return ("$sign wins")
    }
}

fun main() {
    val testPlayer = Player("x")


}