package TicTacToe

interface Game {
    fun checkRows(lst: List<List<String>>, row: Int, column: Int,sign: String): Boolean
    fun checkColumns(lst: List<List<String>>, row: Int, column: Int,sign: String): Boolean
    fun checkDiagonals(lst: List<List<String>>, row: Int, column: Int,sign: String): Boolean
    fun printGameBoard(lst: List<List<String>>)
    fun isValidMove(lst: List<List<String>>, row: Int, column: Int): Boolean
    fun isDone(lst: List<List<String>>, row: Int, column: Int,sign: String): Boolean
    fun putOnBoard(sign: String, row: Int, column: Int): MutableList<List<String>>


}