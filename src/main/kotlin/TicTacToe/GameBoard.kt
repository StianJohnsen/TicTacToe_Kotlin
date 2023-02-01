package TicTacToe

open class GameBoard(val rows: Int = 3, val columns: Int = 3) {



    fun makeList(): List<List<String>> {
        val rows = MutableList(rows) { "" }
        val finalList = MutableList(columns) { rows }
        return finalList


    }

    open val list = makeList()
}

fun main() {


}