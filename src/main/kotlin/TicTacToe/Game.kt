package TicTacToe

abstract class Game {
    abstract fun checkRows()
    abstract fun checkColumns()
    abstract fun checkDiagonals()
    abstract fun printGameBoard()
    abstract fun isValidMove(row: Int, column: Int, player: Int)
    abstract fun isDone(): Boolean
    abstract fun putOnBoard(sign:String,lst:List<String>,row: Int, column: Int)


}