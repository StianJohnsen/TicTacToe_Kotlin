package TicTacToe

interface Game {
    fun checkRows()
    fun checkColumns()
    fun checkDiagonals()
    fun printGameBoard(lst: List<List<String>>)
    fun isValidMove(lst: List<List<String>>, row: Int, column: Int): Boolean
    fun isDone(): Boolean
    fun putOnBoard(sign: String, lst: List<List<String>>, row: Int, column: Int)


}