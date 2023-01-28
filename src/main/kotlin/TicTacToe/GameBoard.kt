package TicTacToe

open class GameBoard(val rows: Int = 3, val columns: Int = 3) {
    open val _rows = rows
    open val _columns = columns
    fun makeList(): List<List<String>> {
        val rows = MutableList(_rows) { "" }
        val finalList = MutableList(_columns) { rows }
        return finalList


    }

    open val list = makeList()
}

fun main() {


}