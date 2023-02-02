package ticTacToe

interface Game {
    fun checkRows(lst: List<List<String>>, row: Int, sign: String): Int
    fun checkColumns(lst: List<List<String>>, column: Int, sign: String): Int
    fun checkDiagonals(lst: List<List<String>>, sign: String): Int
    fun printGameBoard(lst: List<List<String>>)
    fun isDone(lst: List<List<String>>, row: Int, column: Int, sign: String): Boolean
    fun putOnBoard(lst: List<List<String>>, sign: String, row: Int, column: Int): MutableList<List<String>>


}