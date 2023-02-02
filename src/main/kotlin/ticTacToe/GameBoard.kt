package ticTacToe

abstract class GameBoard() {


    fun makeList(rows: Int, columns: Int): List<List<String>> {
        val rows = MutableList(rows) { "" }
        val finalList = MutableList(columns) { rows }
        return finalList
    }


}

fun main() {


}