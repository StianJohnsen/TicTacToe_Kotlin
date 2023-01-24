package TicTacToe

class GameBoard(val rows: Int = 3, val columns: Int = 3) {
    val _rows = rows
    val _columns = columns
    fun makeList(): List<List<String>> {
        val rows = MutableList(_rows) { "" }
        val finalList = MutableList(_columns) { rows }
        return finalList


    }

    val list = makeList()
}

fun main() {
    val test = GameBoard()
    println(test.makeList())


}