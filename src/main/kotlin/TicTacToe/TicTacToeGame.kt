package TicTacToe

import java.awt.color.ICC_ColorSpace

class TicTacToeGame : Game, Player, GameBoard() {
    override val player1Sign: String = "X"

    override val player2Sign: String = "O"
    override fun printWinner() {
        TODO("Not yet implemented")
    }

    override fun checkRows() {
        TODO("Not yet implemented")
    }

    override fun checkColumns() {
        TODO("Not yet implemented")
    }

    override fun checkDiagonals() {
        TODO("Not yet implemented")
    }

    override fun isValidMove(lst: List<List<String>>, row: Int, column: Int): Boolean {
        val _lst = lst
        val _row = row
        val _column = column
        val _lstWRow = _lst[row]
        return _lstWRow[column] == ""
    }

    override fun printGameBoard(lst: List<List<String>>) {
        print(lst)
    }

    override fun isDone(): Boolean {
        return false
    }

    override fun putOnBoard(sign: String, lst: List<List<String>>, row: Int, column: Int) {
        var _lst = lst
        val _sign = sign
        val _row = row
        val _column = column
        val lstRow = _lst[_row]
        val heisann = lstRow[_column]

        println(lst)
        println(lstRow)
        println(heisann)


    }

}

fun main() {
    val game = TicTacToeGame()
    val game_board = GameBoard() // Tar input fra bruker hvis vi vill ha større enn 3x3 brett
    println(game_board.list)

    val player1 = game.player1Sign
    val player2 = game.player2Sign
    val players = arrayOf(player1, player2)
    println("Player 1 will have the sign: X\nWhilest Player 2 will have the sign: O")
    while (true) {
        val playCount = 0
        println(playCount % 2)
        if (game.isDone()) {
            game.printWinner()
            break
        } else {

            println("What row do you wish to place your sign")
            val whatRow = readlnOrNull()!!.toInt()
            println("What column do you wish to place your sign")
            val whatColumn = readlnOrNull()!!.toInt()
            if (game.isValidMove(game_board.list, game_board._rows, game_board._columns)) {
                game.putOnBoard(players[playCount], game_board.list, whatRow, whatColumn)
                game.printGameBoard(game_board.list)
            } else {
                println("Try another row and column")
                continue
            }

        }


    }
}



