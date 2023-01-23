package TicTacToe

class GameBoard(val rows: Int = 3, val columns: Int = 3) {
    val finalList:List<List<String>> = mutableListOf()

    fun makeList(){
    for (i in 0..rows){
        println(i)
    }
    }
}

fun main() {
    val test = GameBoard()
    test.makeList()

}