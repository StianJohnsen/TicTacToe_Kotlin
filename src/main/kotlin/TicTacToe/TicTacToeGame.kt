package TicTacToe

import java.awt.color.ICC_ColorSpace

class TicTacToeGame : Game, Player, GameBoard() {
    override val player1Sign: String = "X"
    override val player2Sign: String = "O"

    val gameboard = GameBoard()
    val currentLst = gameboard.list.toMutableList()


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

    override fun isDone(lst: List<List<String>>,row: Int,column: Int): Boolean {
        val rowLst = lst[row]
        return rowLst[column] == ""
    }

    override fun putOnBoard(sign: String, row: Int, column: Int): MutableList<List<String>> {
        val lst = currentLst
        val rowsLst = lst[row].toMutableList()
        rowsLst[column] = sign
        lst[row] = rowsLst
        return lst
    }

}

fun main() {
    val game = TicTacToeGame()

    val player1 = game.player1Sign
    val player2 = game.player2Sign
    var currentLst = game.list
    val playerCounter = 0
    val players = arrayOf(player1, player2)
    println("Player 1 will have the sign: X\nWhilest Player 2 will have the sign: O")



    while (!game.isDone(currentLst)){
        print("Input your row: ")
        val inputRow = readLine()!!.toInt()
        print("\nInput your column: ")
        val inputColumn = readLine()!!.toInt()
        if (game.isValidMove(currentLst,inputRow,inputColumn)){
            currentLst = game.putOnBoard(players[playerCounter],inputRow,inputColumn)

        }else{
            println("Try different location!")
        }

    }



}




