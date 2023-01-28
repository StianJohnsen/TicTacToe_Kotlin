class Dice {
    var sides: Int = 6

    fun rollDice():Int {
        val randomNum = 1..sides
        return randomNum.random()
    }
}


fun main() {
    val terning1 = Dice()
    terning1.sides = 20
    println(terning1.rollDice())
}