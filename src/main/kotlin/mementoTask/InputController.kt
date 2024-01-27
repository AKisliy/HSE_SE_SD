package mementoTask

class InputController {
    fun getIntInRange(from: Int, to: Int): Int{
        var input = readln().toIntOrNull()
        while(input == null || input < from || input > to){
            println("Incorrect input. Try again!")
            input = readln().toIntOrNull()
        }
        return input
    }

    fun getInt(): Int{
        var input = readln().toIntOrNull()
        while(input == null){
            println("Incorrect input. Try again!")
            input = readln().toIntOrNull()
        }
        return input
    }
}