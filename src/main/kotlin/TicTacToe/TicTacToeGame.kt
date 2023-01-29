package TicTacToe

import java.awt.color.ICC_ColorSpace

class TicTacToeGame : Game, Player, GameBoard() {
    override val player1Sign: String = "X"
    override val player2Sign: String = "O"

    val gameboard = GameBoard()
    val currentLst = gameboard.list.toMutableList()


    override fun printWinner() {
        println("Using printWinner function")
    }

    override fun checkRows(lst: List<List<String>>, row: Int, column: Int, sign: String): Boolean {
        val currentRow = lst[row]
        if (currentRow[0] == sign && currentRow[1] == sign && currentRow[2] == sign) {
            return true
        }


        override fun checkColumns(lst: List<List<String>>, row: Int, column: Int, sign: String): Boolean {
            TODO("Not yet implemented")
        }

        override fun checkDiagonals(lst: List<List<String>>, row: Int, column: Int, sign: String): Boolean {
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

        override fun isDone(lst: List<List<String>>, row: Int, column: Int, sign: String): Boolean {
            return checkRows(lst, row, column, sign)

        }

        override fun putOnBoard(sign: String, row: Int, column: Int): MutableList<List<String>> {
            val lst = currentLst
            val rowsLst = lst[row].toMutableList()
            rowsLst[column] = sign
            lst[row] = rowsLst
            return lst
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
                if (game.isDone(currentLst, inputRow, inputColumn, currentPlayer)) {
                    game.printWinner()
                    break
                } else {
                    if (game.isValidMove(currentLst, inputRow, inputColumn)) {
                        currentLst = game.putOnBoard(players[currentPlayerCounter], inputRow, inputColumn)
                        println(currentLst)
                    } else {
                        playerCounter--
                        println("Try different location!")
                    }
                }


            }


        }




