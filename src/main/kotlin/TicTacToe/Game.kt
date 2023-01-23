package TicTacToe

abstract class Game {
    abstract fun checkRows()
    abstract fun checkColumns()
    abstract fun checkDiagonals()
    abstract fun printGameBoard()
    abstract fun isValidMove(row: Int, column: Int, player: Int)


}