class Dice {
    var sides: Int = 6

    fun rollDice(): Int {
        val randomNum = 1..sides
        return randomNum.random()
    }
}


fun main() {
    val listOfStrings = mutableListOf<String>("X", "X", "X")
    val lst = mutableListOf<List<String>>(listOfStrings, listOfStrings, listOfStrings)
    for(i in lst){
        print("\n")
        for(j in i){
            print(j)
        }
    }
}