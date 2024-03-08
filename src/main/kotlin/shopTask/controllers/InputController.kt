package shopTask.controllers

class InputController(
    private val printer: (String) -> Unit
) {
    fun getUserPassword(): String?{
        while (true) {
            printer("Input your password:")
            val first: String = readln()
            printer("Confirm your password:")
            val second: String = readln()
            if (first == second) {
                return first
            }
            printer("Passwords don't match")
            printer("Try again? Y/N")
            if(getUserApproval())
                continue
            break
        }
        return null
    }

    fun getUserApproval(): Boolean{
        var input = readlnOrNull()
        while(input == null || (input[0] != 'Y' && input[0] != 'N')){
            printer("Unknown command. Try again!")
            input = readlnOrNull()
        }
        return input[0] == 'Y'
    }

    fun getUserString(): String{
        var input = readlnOrNull()
        while(input == null){
            printer("It's not a valid input!")
            input = readlnOrNull()
        }
        return input
    }
}