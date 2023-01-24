package TicTacToe

class TicTacToeGame : Game() {
    override fun checkRows() {
        TODO("Not yet implemented")
    }

    override fun checkColumns() {
        TODO("Not yet implemented")
    }

    override fun checkDiagonals() {
        TODO("Not yet implemented")
    }

    override fun isValidMove(row: Int, column: Int, player: Int) {
        TODO("Not yet implemented")
    }

    override fun printGameBoard() {
        TODO("Not yet implemented")
    }

    override fun isDone(): Boolean {
        return false
    }

    override fun putOnBoard(sign: String, lst: List<String>, row: Int, column: Int) {
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
    println("Player 1 will have the sign: X\nWhilest Player 2 will have the sign: O")
    while (game.isDone() == false) {
        println("What row do you wish to place your sign")
        val whatRow = readLine()?.toInt()
        println("What column do you wish to place your sign")
        val whatColumn = readLine()?.toInt()


    }
    //game.putOnBoard("X",)
    //TODO("Implement")
}

