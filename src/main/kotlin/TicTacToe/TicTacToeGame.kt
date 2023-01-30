package TicTacToe

import java.awt.color.ICC_ColorSpace

class TicTacToeGame : Game, Player, GameBoard() {
    override val player1Sign: String = "X"
    override val player2Sign: String = "O"

    val gameboard = GameBoard()
    val currentLst = gameboard.list.toMutableList()


    override fun printWinner(sign: String): String {
        return ("The winner is: $sign")
    }

    override fun checkRows(lst: List<List<String>>, row: Int, sign: String): Int {


        val currentRow = lst[row]

        if (currentRow[0] == sign && currentRow[1] == sign && currentRow[2] == sign) {
            return row
        }


        return -1
    }


    override fun checkColumns(lst: List<List<String>>, column: Int, sign: String): Int {


        val listOfTrues = mutableListOf<Boolean>(false, false, false)
        for (i in 0..lst.size - 1) {
            val currentLst = lst[i]
            if (currentLst[column] == sign) {
                listOfTrues[i] = true
            }


            if (listOfTrues[0] == true && listOfTrues[1] == true && listOfTrues[2] == true) {
                return i
            }
        }

        return -1
    }

    override fun checkDiagonals(lst: List<List<String>>, sign: String): Int {
        val firstRow = lst[0]
        val secondRow = lst[1]
        val thirdRow = lst[2]

        if (firstRow[0] == sign && secondRow[1] == sign && thirdRow[2] == sign) {
            return 1
        } else if (firstRow[2] == sign && secondRow[1] == sign && thirdRow[0] == sign) {
            return 2
        }


        return -1

    }

    override fun isValidMove(lst: List<List<String>>, row: Int, column: Int): Boolean {
        val _lst = lst
        val _row = row
        val _column = column
        val _lstWRow = _lst[row]
        return _lstWRow[column] == ""
    }

    override fun printGameBoard(lst: List<List<String>>) {
        for (i in lst) {
            println("\n")
            for (j in i) {
                print(j)
            }
        }
    }

    override fun isDone(lst: List<List<String>>, row: Int, column: Int, sign: String): Boolean {
        if (checkRows(lst, row, sign) != -1 || checkColumns(lst, column, sign) != -1 || checkDiagonals(
                lst,
                sign
            ) != -1
        ) {
            return true
        }
        return false
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
    var playerCounter = 0
    val players = arrayOf(player1, player2)
    println("Player 1 will have the sign: X\nWhilest Player 2 will have the sign: O")

    while (true) {
        val currentPlayerCounter = playerCounter % 2
        //println(currentPlayerCounter)
        var currentPlayer = players[currentPlayerCounter]
        playerCounter++
        //println(playerCounter)
        println("Current player is: $currentPlayer")
        print("Input your row: ")
        val inputRow = readLine()!!.toInt()
        print("\nInput your column: ")
        val inputColumn = readLine()!!.toInt()

        if (game.isValidMove(currentLst, inputRow, inputColumn)) {
            currentLst = game.putOnBoard(players[currentPlayerCounter], inputRow, inputColumn)
            currentLst.forEach {
                println(it)
            }
            if (game.isDone(currentLst, inputRow, inputColumn, currentPlayer)) {
                println(game.printWinner(currentPlayer))
                break
            }


        } else {
            playerCounter--
            println("Try different location!")
        }
    }
}










