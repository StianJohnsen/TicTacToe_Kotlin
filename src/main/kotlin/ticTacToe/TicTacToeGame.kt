package ticTacToe



class TicTacToeGame(private val rows: Int = 3, private val columns: Int = 3) : Game, Player, GameBoard() {
    init {
        println("Setting up your board with $rows rows and $columns columns...\n")
    }

    override val player1Sign: String = "X"
    override val player2Sign: String = "O"

    val currentLst = makeList(rows, columns)

    fun isLstFull(lst: List<List<String>>): Boolean {
        for (i in lst) {
            for (j in i) {
                if (j == "") {
                    return false
                }

            }
        }
        return true
    }

    override fun printWinner(sign: String): String {
        return ("\nThe winner is: $sign")
    }

    override fun checkRows(lst: List<List<String>>, row: Int, sign: String): Int {


        val currentRow = lst[row]

        if (currentRow[0] == sign && currentRow[1] == sign && currentRow[2] == sign) {
            return row
        }


        return -1
    }


    override fun checkColumns(lst: List<List<String>>, column: Int, sign: String): Int {


        val listOfTrues = mutableListOf(false, false, false)
        for (i in lst.indices) {
            val currentLst = lst[i]
            if (currentLst[column] == sign) {
                listOfTrues[i] = true
            }


            if (listOfTrues[0] && listOfTrues[1] && listOfTrues[2]) {
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

    val isValidMove = { lst: List<List<String>>, row: Int, column: Int ->
        lst[row][column] == ""
    }


    override fun printGameBoard(lst: List<List<String>>) {
        for (i in lst) {
            print("\n")
            for (j in i) {
                if (j == "") {
                    print(" _")
                } else {
                    print(" $j")
                }
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

    override fun putOnBoard(lst: List<List<String>>, sign: String, row: Int, column: Int): MutableList<List<String>> {
        val currentLst = lst.toMutableList()
        val rowsLst = currentLst[row].toMutableList()
        rowsLst[column] = sign
        currentLst[row] = rowsLst
        return currentLst
    }
}


fun main() {
    val game = TicTacToeGame()

    val player1 = game.player1Sign
    val player2 = game.player2Sign
    var currentLst = game.currentLst.toMutableList()
    var playerCounter = 0
    val players = arrayOf(player1, player2)
    println("Player 1 will have the sign: X\nWhile Player 2 will have the sign: O")

    while (true) {
        val currentPlayerCounter = playerCounter % 2

        val currentPlayer = players[currentPlayerCounter]
        playerCounter++
        //println(playerCounter)
        println("\nCurrent player is: $currentPlayer")
        print("Input your row: ")
        val inputRow = readln().toInt()
        print("\nInput your column: ")
        val inputColumn = readln().toInt()

        if (game.isValidMove(currentLst, inputRow, inputColumn)) {
            println("Current board:")
            currentLst = game.putOnBoard(currentLst, players[currentPlayerCounter], inputRow, inputColumn)
            game.printGameBoard(currentLst)
            if (game.isDone(currentLst, inputRow, inputColumn, currentPlayer)) {
                println(game.printWinner(currentPlayer))
                break
            } else if (game.isLstFull(currentLst)) {
                println("\nTie!")


            }
        } else {
            playerCounter--
            println("Try different location!")
        }
    }
}
